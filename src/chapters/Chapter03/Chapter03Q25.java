package Chapter03;

import java.util.Scanner;

public class Chapter03Q25 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter the values for (x1,y1) , (x2,y2) , (x3,y3) and (x4,y4) ");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();

		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();

		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();

		double x4 = keyboard.nextDouble();
		double y4 = keyboard.nextDouble();

		double x;
		double y;

		double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
		double d = (x3 - x4);
		double b = (x1 - x2);
		double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
		double a = (y1 - y2);
		double c = (y3 - y4);

		if (((y2 - y1) / (x2 - x1)) == ((y4 - y3) / (x4 - x3))) {
			System.out.println(" The two lines are parallel ");
		} else {

			System.out.println("The intersecting point is " + " (X = "  + ( (e * d) - (b * f) ) / ( (a * d) - (b * c ) )  + 
					" Y = " +  ( (a * f) - (e * c) ) / ( (a * d) - (b * c ) ) + " )");
		}

	}

}
