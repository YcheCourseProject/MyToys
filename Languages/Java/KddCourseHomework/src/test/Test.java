package test;

public class Test {
	public static void main(String[] args) {
		double x1=entropy(2.0/12)+entropy(4.0/12)+entropy(6.0/12);
		double x2=2*(entropy(1.0/12)+entropy(2.0/12)+entropy(3.0/12));
		double x0=entropy(1.0/4)+entropy(3.0/4);
		System.out.println(x0);
		System.out.println(x1);
		System.out.println(x2);
		
		System.out.println("c1".compareTo("b1"));
	}

	public static double entropy(double x) {
		return - Math.log(x) / Math.log(2) * x;
	}
}
