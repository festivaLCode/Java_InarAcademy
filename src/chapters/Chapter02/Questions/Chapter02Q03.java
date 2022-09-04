package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q03 {
	public static void main(String[] args) {
		// We will get a integer value and convert feet into meters

		Scanner keyboard = new Scanner(System.in);

		System.out.println("  Enter a value for feet");
		// f= Feet(foot)
		// m = meters
		double f = keyboard.nextDouble();
		double m;

		m = f * 0.305;

		System.out.println(f + "  feet is equal to   " + m + "  in meters");

	}

}
