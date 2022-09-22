package Chapter04;

import java.util.Scanner;

public class Chapter04Q07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Please enter the radius of the bounding circle:   ");
		double radius = input.nextDouble();

		double x1 = radius * Math.cos(90);
		double y1 = radius * Math.sin(90);

		double x2 = radius * Math.cos(144);
		double y2 = radius * Math.sin(144);

		double x3 = radius * Math.cos(216);
		double y3 = radius * Math.sin(216);

		double x4 = radius * Math.cos(288);
		double y4 = radius * Math.sin(288);

		double x5 = radius * Math.cos(360);
		double y5 = radius * Math.sin(360);

		System.out.println(" The coordinates of five points on the pentagon are ");

		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");
		System.out.println("(" + x3 + "," + y3 + ")");
		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");

	}

}