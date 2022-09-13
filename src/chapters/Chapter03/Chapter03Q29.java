package Chapter03;

import java.util.Scanner;

public class Chapter03Q29 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter circle 1`s center coordinates (x,y) and the length of the radius");

		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double radius1 = keyboard.nextDouble();
		
		System.out.println(" Please enter circle 2`s center coordinates (x,y) and the length of the radius");
		
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double radius2 = keyboard.nextDouble();
		
		double distance = Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)), 0.5);

		if (distance <= (radius1 - radius2) && distance >= (radius2 - radius1)) {
			System.out.println(" Circle 2 is inside Circle 1");

		} else if (distance <= radius1 + radius2) {
			System.out.println(" Circle 2 overlaps Circle 1");
		} else {
			System.out.println(" Circle 2 does not overlap Circle 1");
		}
		System.exit(1);

	}

}
