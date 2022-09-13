package Chapter03;

import java.util.Scanner;

public class Chapter03Q34 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the coordinates for p0, p1 and p2 ( x0,yo), (x1,y1) and (x2, y2)");

		double x0 = keyboard.nextDouble();
		double y0 = keyboard.nextDouble();

		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();

		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();

		if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0 || ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0)) {
			System.out.println("(" + (x2) + ", " + y2 + ")" + " is not on the line segment from  " + "(" + (x0)
					+ "," + y0 + ")" + "(" + (x1) + ", " + y1 + ")");
		} else if ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) {
			System.out.println("(" + (x2) + ", " + y2 + ")" + " is on the line segment  from  " + "(" + (x0) + "," + y0
					+ ")" +" to "+ "(" + (x1) + ", " + y1 + ")");
		}

	}

}
