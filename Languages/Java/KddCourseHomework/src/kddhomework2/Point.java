package kddhomework2;

public class Point {
	double x;
	double y;
	int clusternum;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.clusternum = -1;
	}

	public Point(Point point) {
		super();
		this.x = point.x;
		this.y = point.y;
		this.clusternum = -1;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public int getClusternum() {
		return clusternum;
	}

	public void setClusternum(int clusternum) {
		this.clusternum = clusternum;
	}

	public double distance(Point point) {
		return Math.pow((this.x - point.x), 2)
				+ Math.pow((this.y - point.y), 2);
	}
}
