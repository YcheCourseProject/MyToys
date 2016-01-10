package kddhomework2;

public class FuzzyClustering {
	public static void main(String []args){
		ScanPoint a1=new ScanPoint(2,10,"a1");
		ScanPoint a2=new ScanPoint(2,5,"a2");
		ScanPoint a3=new ScanPoint(8,4,"a3");
		ScanPoint a4=new ScanPoint(5,8,"a4");
		ScanPoint []points=new ScanPoint[]{a1,a2,a3,a4};
		ScanPoint c1=new ScanPoint(3.1722d,9.0599d,"c1");
		ScanPoint c2=new ScanPoint(3.9513d,5.0566d,"c2");
		ScanPoint []centers=new ScanPoint[]{c1,c2};
		for(int i=0;i<points.length;i++){
			for(int j=0;j<centers.length;j++){
				System.out.print(Math.pow(points[i].distance(centers[1-j]), 2)/(Math.pow(points[i].distance(centers[0]), 2)+Math.pow(points[i].distance(centers[1]), 2))+"\t");
			}
			System.out.println();
		}
			
	}

}
