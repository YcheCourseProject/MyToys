package kddhomework2;

public class KMedoids {
	public static void main(String[]args){
		Point a1=new Point(2,10);
		Point a2=new Point(2,5);
		Point a3=new Point(8,4);
		Point b1=new Point(5,8);
		Point b2=new Point(7,5);
		Point b3=new Point(6,4);
		
		Point[] points=new Point[]{a1,a2,a3,b1,b2,b3};
		Point[] medoids=new Point[]{a1,b1};
		Point[] medoids2=new Point[]{a1,a2};
		for(int i=0;i<points.length;i++){
			for(int j=0;j<medoids.length;j++)
			{
				double distance=points[i].distance(medoids[j]);
				System.out.print("dist("+i+","+j+")"+distance+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<points.length;i++){
			for(int j=0;j<medoids2.length;j++)
			{
				double distance=points[i].distance(medoids2[j]);
				System.out.print("dist("+i+","+j+")"+distance+"\t");
			}
			System.out.println();
		}
	}
}
