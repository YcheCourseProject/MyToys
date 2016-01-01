package test;

public class DecisionTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(info(8.0/14,6.0/14));
		System.out.println(info(5.0/8,3.0/8));
		System.out.println(info(2.0/6,4.0/6));
		System.out.println(info(5.0/6,1.0/6));
		System.out.println(info(6.0/14,4.0/14,4.0/14));
		System.out.println(info(2.0/3,1.0/3));
		System.out.println(info(3.0/4,1.0/4));
		System.out.println(info(1.0/2,1.0/2));
	}
	
//	public static void print(double...ds){
//		System.out.println(info(ds));
//	}
	
	public static double info(double... ds){
		double check=0;
		for(double d:ds){
			check+=d;
		}
		if(Math.round(check)!=1){
			System.out.println("error:");
			System.out.println(check);
		}
		double sum=0;
		for(double d : ds){
			sum+=entropy(d);
		}
		sum= (double) (Math.round(sum*10000)/10000.0);
		return sum;
	}
	
	public static double entropy(double x) {
		return - Math.log(x) / Math.log(2) * x;
	}
}
