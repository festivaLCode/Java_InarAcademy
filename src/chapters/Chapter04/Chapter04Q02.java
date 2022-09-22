package Chapter04;

import java.util.Scanner;

public class Chapter04Q02 {
	public static void main(String[] args) {
		/*
		 * (x1, y1) and (x2, y2) be the geographical latitude and longitude of two
		 * points.
		 */

		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter point  1 (latitude and longitude) in degrees  : ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		System.out.println(" Please enter point  2 (latitude and longitude) in degrees  : ");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		// We will use the following formula
		// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

		final double radius = 6371.01;
		double distance;

		double radianX1 = Math.toRadians(x1);
		double radianY1 = Math.toRadians(y1);
		double radianX2 = Math.toRadians(x2);
		double radianY2 = Math.toRadians(y2);

		distance = radius * (Math.acos( (Math.sin(radianX1) * Math.sin(radianX2) ) +
                ( Math.cos(radianX1) * Math.cos(radianX2) * Math.cos(radianY1 - radianY2))));
		
		System.out.printf(" The distance between the two points given is  >>> " +  distance + " km ");

	}

}
