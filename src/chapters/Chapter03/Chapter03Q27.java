package Chapter03;

import java.util.Scanner;

public class Chapter03Q27 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Enter a point's x- and y-coordinates: ");

		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();

		if (x / 200 <=  (100 - y) / 100 ) {
			System.out.println(" The point is in the triangle");

		} else {
			System.out.println(" The point is NOT in the triangle ");
		}
		System.exit(1);

	}
}
