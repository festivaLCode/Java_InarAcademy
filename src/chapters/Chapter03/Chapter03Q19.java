package Chapter03;

import java.util.Scanner;

public class Chapter03Q19 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the lenght of 3 sides of the triangle ");

		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();

		if (a + b <= c || b + c <= a || a + c <= b) {
			System.out.println(" The value of the sides can not form a traingle ");
			System.exit(1);
		} else {
			System.out.println(" The perimeter of a triangle is " + " a + b + c  >>  =" + (a + b + c));
		}

	}
}
