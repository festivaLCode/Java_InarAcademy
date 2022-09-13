package Chapter03;

import java.util.Scanner;

public class Chapter03Q23 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter a point with two coordinates : (x , y)  ");
		// We will check if the point we entered is inside the rectangle centered at the
		// origin
		// and with a width of 10 and a height of 5.

		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();

		if (y <= 2.5 && y >= -2.5  && x <= 5 && x >= -5) {
			System.out.println("  Point " + "(" + x + "," + y + ")" + " is in the rectangle ");
		} else {
			System.out.println("  Point " + "(" + x + "," + y + ")" + " is in not in the rectangle ");
		} System.exit(1);

	}

}
