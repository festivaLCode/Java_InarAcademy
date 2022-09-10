package Chapter03;

import java.util.Scanner;

public class Chapter03Q03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// To solve Cramer`s rule, we will give values for a,b,c,d,e, and f
		System.out.println(" Please enter values for a, b, c, d, e, and f accordingly >>>");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		double d = keyboard.nextDouble();
		double e = keyboard.nextDouble();
		double f = keyboard.nextDouble();

		double x;
		double y;

		x = ((e * d) - (b * f)) / ((a * d) - (b * c));

		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		if (a *d - b *c == 0) {
			System.out.println( " The equation has no solution ");
		}else 
			System.out.println( " x =  " + x + "  y = " + y);

	}

}
