package Chapter04;

public class Chapter04Q06 {
	public static void main(String[] args) {
		// The circle is centered at (0,0) with a radius of 40 units.

		final double radius = 40;
		
		int n = (int) (Math.random() * 361);
		int o = (int) (Math.random() * 361);
		int p = (int) (Math.random() * 361);

		double a1 = Math.toRadians(n);
		double a2 = Math.toRadians(o);
		double a3 = Math.toRadians(p);

		double x1 = radius * Math.cos(a1);
		double y1 = radius * Math.sin(a1);

		double x2 = radius * Math.cos(a2);
		double y2 = radius * Math.sin(a2);

		double x3 = radius * Math.cos(a3);
		double y3 = radius * Math.sin(a3);

		System.out.println(" First random point on the circle is " + "(" + x1 + "," + y1 + ")");
		System.out.println(" First random point on the circle is " + "(" + x2 + "," + y2 + ")");
		System.out.println(" First random point on the circle is " + "(" + x3 + "," + y3 + ")");

	}

}
