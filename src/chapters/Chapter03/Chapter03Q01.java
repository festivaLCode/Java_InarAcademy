package Chapter03;

import java.util.Scanner;

public class Chapter03Q01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter the values for a ,  b , and c  >>>");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();

		double discriminant = (Math.pow(b, 2)) - 4 * a * c;
		double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		double r2 = ( -b - Math.pow(discriminant, 0.5)) / 2 * a;

		if (discriminant > 0) {
			System.out.println(" The equation has two roots " + "r1 >> = " +  r1 + "  r2  >> = " + r2 );
		} else if (discriminant == 0) {
				System.out.println(" The equation has one root " + " root = " +   r1);
				// r1 = r2 so, it does not matter which root we use for the answer
			} else {
				System.out.printf(" The equation has no real roots ");
				System.exit(1);

			
		}

	}

}
