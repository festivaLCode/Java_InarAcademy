package Chapter03;

import java.util.Scanner;

public class Chapter03Q28 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter R1`s center`s coordinates (x,y) , widht and height");

		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double width1 = keyboard.nextDouble();
		double height1 = keyboard.nextDouble();

		System.out.println(" Please enter R2`s center`s coordinates (x,y) , widht and height ");

		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double width2 = keyboard.nextDouble();
		double height2 = keyboard.nextDouble();

		double r1xHigh = (x1 + (width1 / 2));
		double r1xLow = (x1 - (width1 / 2));
		double r1yHigh = (y1 + (height1 / 2));
		double r1yLow = (y1 - (height1 / 2));

		double r2xHigh = (x2 + (width2 / 2));
		double r2xLow = (x2 - (width2 / 2));
		double r2yHigh = (y2 + (height2 / 2));
		double r2yLow = (y2 - (height2 / 2));

		if (r1xHigh < r2xLow || r1xLow > r2xHigh || r1yHigh < r2yLow || r1yLow > r2yHigh) {
			System.out.println(" R2 does not overlap R1 ");
		} else if ( (r1xHigh >= r2xHigh && r1xLow <= r2xLow) || (r1yHigh >= r2yHigh && r1yLow <= r2yLow )) {
			System.out.println(" R2 is inside R1 ");
		} else {
			System.out.println(" R2 Overlaps R1");
		}
		System.exit(1);

	}

}
