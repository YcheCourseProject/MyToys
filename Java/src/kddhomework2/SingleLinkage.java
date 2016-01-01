package kddhomework2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingleLinkage {

	public static void main(String[] args) {
		ScanPoint a1 = new ScanPoint(2, 10, "a1");
		ScanPoint a2 = new ScanPoint(2, 5, "a2");
		ScanPoint a3 = new ScanPoint(8, 4, "a3");
		ScanPoint b1 = new ScanPoint(5, 8, "b1");
		ScanPoint b2 = new ScanPoint(7, 5, "b2");
		ScanPoint b3 = new ScanPoint(6, 4, "b3");
		ScanPoint c1 = new ScanPoint(1, 2, "c1");
		ScanPoint c2 = new ScanPoint(4, 9, "c2");
		// initial
		ScanPoint[] points = new ScanPoint[] { a1, a2, a3, b1, b2, b3, c1, c2 };
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				DecimalFormat df = new DecimalFormat("0.00");
				System.out.print("dist(" + points[i].getPointName() + ","
						+ points[j].pointName + ")" + "="
						+ df.format(points[i].distance(points[j])) + "\t");
			}
			System.out.println();
		}

		List<Cluster> clusters = new ArrayList<Cluster>();
		clusters.add(new Cluster(a1));
		clusters.add(new Cluster(a2));
		clusters.add(new Cluster(a3));
		clusters.add(new Cluster(b1));
		clusters.add(new Cluster(b2));
		clusters.add(new Cluster(b3));
		clusters.add(new Cluster(c1));
		clusters.add(new Cluster(c2));
		Cluster.initDistanceAmongClusters(clusters);
		printDistanceMatrix(clusters);
		
		int iteration = 0;
		while (true) {
			iteration++;
			System.out.println(iteration + ":");
			// scan to find min
			if (clusters.size() == 1)
				break;
			double minDistance = Double.MAX_VALUE;
			Cluster startCluster = null;
			Cluster endCluster = null;
			for (Iterator<Cluster> iterator = clusters.iterator(); iterator
					.hasNext();) {
				Cluster examCluster = iterator.next();
				if (examCluster.minDistance < minDistance) {
					startCluster = examCluster;
					endCluster = examCluster.minDistanceCluster;
					minDistance = examCluster.minDistance;
				}
			}
			if (minDistance > Cluster.INTER_CLUSTER_MIN_EPS)
				break;
			Cluster.MergeCluster(startCluster, endCluster);
			clusters.remove(endCluster);
			printDistanceMatrix(clusters);
		}

	}

	public static String getClusterName(Cluster cluster) {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < cluster.getPoints().size(); i++) {
			sb.append(cluster.getPoints().get(i).getPointName()).append(",");
		}
		return sb.substring(0, sb.length() - 1) + "}";
	}

	public static void printDistanceMatrix(List<Cluster> clusters) {
		for (int i = 0; i < clusters.size(); i++) {
			for (int j = 0; j < clusters.size(); j++) {
				DecimalFormat df = new DecimalFormat("0.00");
				String nameLeft=getClusterName(clusters.get(i));
				String nameRight= getClusterName(clusters.get(j));
				String dist=df.format((double)clusters.get(i).getDistanceMap().get(clusters.get(j)));
				System.out.print("dist("
						+ nameLeft
						+ ","
						+nameRight
						+ ")"
						+ "="
						+ dist+ "\t");
			}
			System.out.println();
		}
	}
}
