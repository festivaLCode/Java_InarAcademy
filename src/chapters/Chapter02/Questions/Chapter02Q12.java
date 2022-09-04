package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q12 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// v = starting velocity in meters/second
		// a = acceleration in meters/second^2
		System.out.println(" Please enter speed(v) and acceleration(a)");

		double v = keyboard.nextDouble();
		double a = keyboard.nextDouble();
		// l = length of minimum runway
		
		double length = (v * v) / (2 * a) ;
		

		System.out.printf(" The minimum runway length for the airplane is  : %.3f", length);

	}

}
