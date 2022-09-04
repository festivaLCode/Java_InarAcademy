package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q09 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// v0 = starting velocity in meters/second
		// v1 = the ending velocity in meters/second
		// t = time span in seconds
		System.out.println(" Please enter v0 , v1 and t");

		double v0 = keyboard.nextDouble();
		double v1 = keyboard.nextDouble();
		double t = keyboard.nextDouble();
		// a = average accelaration
		double a = (v1 - v0) / t;

		System.out.printf(" The average acceleration is : %.4f", a);

	}

}
