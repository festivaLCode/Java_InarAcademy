package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Obtain a value between -20 and 50 in Celcius

		System.out.println(" Please enter a value between -20 and 50 in Celcius");

		double C = keyboard.nextDouble();

		double F;

		F = C * (9.0 / 5) + 32;
		System.out.println(C + "  Celcius is equal to  " + F);

	}

}
