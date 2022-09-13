package Chapter03;

import java.util.Scanner;

public class Chapter03Q22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the coordinates >>> ( x,y ) ");
		// We will check if the point entered if it is inside the circle centered (0 ,0 )
		// and with a radius of 10

		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();

		if (Math.pow(((x - 0) * (x - 0) + (y - 0) * (y - 0)), 0.5) <= 10) {
			System.out.println("  Point " + "(" + x + "," + y +")" + " is in the circle ");

		} else {
			System.out.println("  Point " + (x + "," + y) + " is NOT in the circle ");
			System.exit(1);
		}

	}

}
