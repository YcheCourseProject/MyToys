package kddhomework2;

import java.util.ArrayList;
import java.util.Iterator;

public class ScanPoint extends Point {

	public static int MIN_PTS = 3;
	public static int EPS = 1;
	String pointName;
	ArrayList<ScanPoint> scanPointsList;

	public ScanPoint(double x, double y, String pointName) {
		super(x, y);
		this.pointName = pointName;
		this.scanPointsList = new ArrayList<ScanPoint>();
		this.scanPointsList.add(this);
	}

	public ScanPoint(ScanPoint scanPoint,String pointName){
		super(scanPoint);
		this.setPointName(pointName);
	}
	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public ArrayList<ScanPoint> getScanPointsList() {
		return scanPointsList;
	}

	public void setScanPointsList(ArrayList<ScanPoint> scanPointsList) {
		this.scanPointsList = scanPointsList;
	}

	@Override
	public double distance(Point point) {
		// TODO Auto-generated method stub
		return Math.sqrt(super.distance(point));
	}

	public boolean isCore() {
		if (this.scanPointsList.size() >= MIN_PTS) {
			return true;
		} else
			return false;
	}

	public boolean isBorder() {
		if (this.isCore())
			return false;
		// not core
		for (Iterator<ScanPoint> iterator = this.scanPointsList.iterator(); iterator
				.hasNext();) {
			ScanPoint scanPoint = iterator.next();
			if (scanPoint == this)
				continue;
			else if (scanPoint.isCore()) {
				return true;
			}
		}
		return false;
	}

	public boolean isOutLier() {
		if (this.isCore() || this.isBorder()) {
			return false;
		} else
			return true;
	}

}
