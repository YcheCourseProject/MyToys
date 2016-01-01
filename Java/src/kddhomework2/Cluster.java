package kddhomework2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Cluster {
	public static double INTER_CLUSTER_MIN_EPS = 4;
	List<ScanPoint> points;
	Map<Cluster, Double> distanceMap;
	double minDistance;
	Cluster minDistanceCluster;

	public Cluster(ScanPoint scanPoint) {
		super();
		this.points = new ArrayList<ScanPoint>();
		this.points.add(scanPoint);
		this.distanceMap = new HashMap<Cluster, Double>();
		this.minDistance = Double.MAX_VALUE;
		this.minDistanceCluster = null;
	}

	public List<ScanPoint> getPoints() {
		return points;
	}

	public void setPoints(List<ScanPoint> points) {
		this.points = points;
	}

	public Map<Cluster, Double> getDistanceMap() {
		return distanceMap;
	}

	public void setDistanceMap(Map<Cluster, Double> distanceMap) {
		this.distanceMap = distanceMap;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Cluster getMinDistanceCluster() {
		return minDistanceCluster;
	}

	public void setMinDistanceCluster(Cluster minDistanceCluster) {
		this.minDistanceCluster = minDistanceCluster;
	}

	public static void initDistanceAmongClusters(List<Cluster> clusters) {
		for (int i = 0; i < clusters.size(); i++) {
			for (int j = 0; j < clusters.size(); j++) {
				assert (clusters.get(i).points.size() == 1 && clusters.get(j).points
						.size() == 1);
				double tempDistance = clusters.get(i).points.get(0).distance(
						clusters.get(j).points.get(0));
				clusters.get(i).distanceMap.put(clusters.get(j), tempDistance);
				if (tempDistance != 0
						&& tempDistance < clusters.get(i).getMinDistance()) {
					clusters.get(i).setMinDistance(tempDistance);
					clusters.get(i).setMinDistanceCluster(clusters.get(j));
				}
			}
		}
	}

	public static Cluster MergeCluster(Cluster leftCluster, Cluster rightCluster) {
		// add points
		leftCluster.points.addAll(rightCluster.points);
		// traverse leftcluster
		for (Iterator<Entry<Cluster, Double>> iterator = leftCluster.distanceMap
				.entrySet().iterator(); iterator.hasNext();) {
			Entry<Cluster, Double> entry = iterator.next();
			Cluster anotherCluster = entry.getKey();
			if (anotherCluster == rightCluster||anotherCluster==leftCluster)
				break;
			else {
				// remove rightCluster
				anotherCluster.distanceMap.remove(rightCluster);
				if (anotherCluster.minDistanceCluster == rightCluster) {
					anotherCluster.minDistance = Double.MAX_VALUE;
					anotherCluster.minDistanceCluster = null;
				}
				// update distance to leftCluster
				double newDistance = Math.min(
						leftCluster.distanceMap.get(anotherCluster),
						rightCluster.distanceMap.get(anotherCluster));
				anotherCluster.distanceMap.put(leftCluster, newDistance);
				leftCluster.distanceMap.put(anotherCluster, newDistance);
				//reset min
				if(anotherCluster.minDistanceCluster==rightCluster){
					anotherCluster.minDistanceCluster=leftCluster;
				}
			}
		}
		//remove right
		leftCluster.distanceMap.remove(rightCluster);
		leftCluster.minDistance=Double.MAX_VALUE;
		leftCluster.minDistanceCluster=null;
		for (Iterator<Entry<Cluster, Double>> iterator = leftCluster.distanceMap
				.entrySet().iterator(); iterator.hasNext();) {
			Entry<Cluster, Double> entry = iterator.next();
			Cluster anotherCluster = entry.getKey();
			if(anotherCluster==leftCluster)
				break;
			else{
				if(anotherCluster.distanceMap.get(leftCluster)<leftCluster.minDistance){
					leftCluster.minDistance=anotherCluster.distanceMap.get(leftCluster);
					leftCluster.minDistanceCluster=anotherCluster;
				}
			}
		}
		 
		return leftCluster;
	}

}
