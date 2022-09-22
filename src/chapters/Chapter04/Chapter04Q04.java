package Chapter04;

import java.util.Scanner;

public class Chapter04Q04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter the length of the side : ");

		// s = length of the side

		double s = keyboard.nextDouble();

		// Area = (6 * (s * s) ) / 4 * tan(PI / 6 )
		// s = 2 * r * sin( PI /5)

		double b = Math.tan(Math.PI / 6);

		double Area;

		Area = (6 * Math.pow(s, 2)) / (4 * b);

		System.out.printf(" The area of the hexagon is " + "%.2f", Area);

	}
}
