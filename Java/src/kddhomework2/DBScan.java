package kddhomework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DBScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScanPoint x1 = new ScanPoint(0, 0, "x1");
		ScanPoint x2 = new ScanPoint(1, 0, "x2");
		ScanPoint x3 = new ScanPoint(1, 1, "x3");
		ScanPoint x4 = new ScanPoint(2, 2, "x4");
		ScanPoint x5 = new ScanPoint(3, 1, "x5");
		ScanPoint x6 = new ScanPoint(3, 0, "x6");
		ScanPoint x7 = new ScanPoint(0, 1, "x7");
		ScanPoint x8 = new ScanPoint(3, 2, "x8");
		ScanPoint x9 = new ScanPoint(6, 3, "x9");
		ScanPoint[] points = new ScanPoint[] { x1, x2, x3, x4, x5, x6, x7, x8,
				x9 };
		ArrayList<ScanPoint> corePoints=new ArrayList<ScanPoint>();
		ArrayList<ArrayList<ScanPoint>> clusters=new ArrayList<ArrayList<ScanPoint>>(); 		
		
		// first scan
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				if (points[i].distance(points[j]) <= ScanPoint.EPS) {
					points[i].getScanPointsList().add(points[j]);
					points[j].getScanPointsList().add(points[i]);
				}
			}
		}
		
		//print
		for (ScanPoint point : points) {
			System.out.print(point.getPointName() + ":{");
			for (Iterator<ScanPoint> iterator = point.getScanPointsList()
					.iterator(); iterator.hasNext();) {
				String name = iterator.next().getPointName();
				if (iterator.hasNext() == false) {
					System.out.print(name + "}");
					System.out.println();
				} else
					System.out.print(name + ",");
			}
		}
		
		// second scan :enque
		for(ScanPoint point:points){
			if(point.isCore()){
				corePoints.add(point);
			}
		}
		
		//cluster
		int clusterNum=0;
		for(Iterator<ScanPoint> iterator=corePoints.iterator();iterator.hasNext();){
			ScanPoint examPoint=iterator.next();
			if(examPoint.getClusternum()==-1){
				clusters.add(BFS(examPoint,clusterNum++));
			}
		}
		
		System.out.println();
		//print result
		for(int i=0;i<clusters.size();i++){
			System.out.print("cluster"+i+":{");
			for(int j=0;j<clusters.get(i).size();j++){
				if(j==clusters.get(i).size()-1)
					System.out.print(clusters.get(i).get(j).getPointName()+"}");
				else
					System.out.print(clusters.get(i).get(j).getPointName()+",");
			}
			System.out.println();
		}
	}

	
	public static ArrayList<ScanPoint> BFS(ScanPoint point,int clusterNum){
		assert(clusterNum>=1);
		ArrayList<ScanPoint> cluster=new ArrayList<ScanPoint>();
		Queue<ScanPoint> pointsQue=new LinkedList<ScanPoint>();
		pointsQue.add(point);
		while(pointsQue.peek()!=null){
			ScanPoint scanPoint=pointsQue.poll();
			//mark
			if(scanPoint.getClusternum()==-1)
			{
				
				scanPoint.setClusternum(clusterNum);
				cluster.add(scanPoint);
			}
			//expand
			if(scanPoint.isCore()){
				for(Iterator<ScanPoint> iterator=scanPoint.getScanPointsList().iterator();iterator.hasNext();){
					ScanPoint tempPoint=iterator.next();
					if(tempPoint.getClusternum()==-1)
						pointsQue.add(tempPoint);
				}
			}
		}
		return cluster;
	}
}
