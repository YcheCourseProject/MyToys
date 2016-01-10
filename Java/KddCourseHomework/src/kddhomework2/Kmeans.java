package kddhomework2;

import java.util.ArrayList;

public class Kmeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a1 = new Point(2, 10);
		Point a2 = new Point(2, 5);
		Point a3 = new Point(8, 4);
		Point b1 = new Point(5, 8);
		Point b2 = new Point(7, 5);
		Point b3 = new Point(6, 4);
		Point c1 = new Point(1, 2);
		Point c2 = new Point(4, 9);

		Point mean1 = new Point(a1);
		Point mean2 = new Point(b1);
		Point mean3 = new Point(c1);
		Point[] means = new Point[] { mean1, mean2, mean3 };
		Point[] points = new Point[] { a1, a2, a3, b1, b2, b3, c1, c2 };
		ArrayList<Point>[] clusterArrayList = new ArrayList[] { new ArrayList(),
				new ArrayList(), new ArrayList() };

		boolean flag = true;
		int iterationNum = 0;
		while (flag) {
			flag = false;
			iterationNum++;
			System.out.println("Iteration"+iterationNum+":");
			// Expectation
			for (ArrayList cluster : clusterArrayList) {
				cluster.clear();
			}
			
			for (int i = 0; i < points.length; i++) {
				double minDistance = Double.MAX_VALUE;
				Point currentPoint = points[i];
				int minCostIndex=-1;
				for (int j = 0; j < means.length; j++) {
					double distance = currentPoint.distance(means[j]);
					System.out.print("dist("+i+","+j+"):"+distance+";\t\t");
					if (distance < minDistance) {
							minDistance = distance;
							minCostIndex=j;
					}
				}
				if(currentPoint.getClusternum()!=minCostIndex){
					flag=true;
					currentPoint.setClusternum(minCostIndex);
				}
				System.out.print("is cluster"+(minCostIndex+1));
				System.out.println();
				clusterArrayList[minCostIndex].add(currentPoint);
			}
			
			//Maximization
			for(int i=0;i<means.length;i++){
				double xSum=0;
				double ySum=0;
				for(int j=0;j<clusterArrayList[i].size();j++)
				{
					xSum+=clusterArrayList[i].get(j).getX()/clusterArrayList[i].size();
					ySum+=clusterArrayList[i].get(j).getY()/clusterArrayList[i].size();
				}
				means[i].setX(xSum);
				means[i].setY(ySum);
				System.out.print("mean"+i+":("+xSum+","+ySum+");");
			}
			System.out.println();
			
		}
	}

}
