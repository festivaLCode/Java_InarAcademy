package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q04 {
	public static void main(String[] args) {
		// We will get a integer value and convert pound into kilos

		Scanner keyboard = new Scanner(System.in);

		System.out.println("  Enter a number in pounds ");
		// p= pounds
		// k = kilos
		double p = keyboard.nextDouble();
		double k;

		k = p * 0.454;

		System.out.println( p + "  pound is equal to   " + k + "  in kilos");

	}
}