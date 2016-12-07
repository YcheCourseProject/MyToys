using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Data;
using System.Data.OleDb;

namespace EmailProcess
{

    class Program
    {
        static OleDbCommand GetUpdateSql(String companyName, String emailAddr)
        {
            OleDbCommand oleDbCommand = new OleDbCommand();
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.Append(@"update [匹配公司名和邮箱地址] set [Remark] = 'Company Email' ").
                Append("where [Company Name] = ").Append("@companyName").
                Append(" and [Email address] = ").Append("@emailAddr");
            oleDbCommand.CommandText = strBuilder.ToString();
            oleDbCommand.Parameters.AddWithValue("@companyName", companyName);
            oleDbCommand.Parameters.AddWithValue("@emailAddr", emailAddr);
            return oleDbCommand;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("File Path/Name is " + args[0]);
            String ConStr = @"Provider=Microsoft.ACE.OLEDB.12.0;" +
            @"Data source= " + args[0];
            int rowsAffectedNum = 0;

            OleDbConnection oleCon = new OleDbConnection(ConStr);
            OleDbDataAdapter oleDap = new OleDbDataAdapter("select * from [匹配公司名和邮箱地址]", oleCon);
            DataSet ds = new DataSet();
            oleDap.Fill(ds);

            oleCon.Open();
            foreach (DataRow row in ds.Tables[0].Rows)
            {
                String emailAddrStr = row["Email address"].ToString();
                emailAddrStr = Regex.Replace(emailAddrStr, "-", "");
                if (emailAddrStr.Contains("@"))
                {
                    String rightStr = Regex.Split(emailAddrStr, "@")[1];
                    rightStr = Regex.Split(rightStr, "\\.")[0];
                    StringBuilder strBuilder = new StringBuilder();
                    foreach (Char char_in_string in rightStr)
                    {
                        strBuilder.Append(char_in_string).Append(".*");
                    }
                    Regex r = new Regex(strBuilder.ToString(), RegexOptions.IgnoreCase);
                    String nameStr = row["Company Name"].ToString();
                    Match m = r.Match(nameStr);
                    if (m.Success)
                    {
                        OleDbCommand oleCommand = GetUpdateSql(row["Company Name"].ToString(), row["Email address"].ToString());
                        oleCommand.Connection = oleCon;
                        rowsAffectedNum += oleCommand.ExecuteNonQuery();
                        if (rowsAffectedNum % 1000 == 0)
                            Console.WriteLine(rowsAffectedNum + "Has been elected");
                    }

                }
            }

            Console.WriteLine("All " + rowsAffectedNum + " Records Related, Press Any Key Exit :)");
            oleCon.Close();
            oleCon.Dispose();
            Console.Read();
        }
    }
}
