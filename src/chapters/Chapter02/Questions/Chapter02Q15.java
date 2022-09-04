package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q15 {

	public static void main(String[] args) {
		// In this question we will find geometric distance
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter x1  and  y1");
		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();

		System.out.println(" Please enter x2  and  y2");
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();

		// We will use geometric distance formula

		double d;
		d = (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));

		double distance = (Math.pow(d, 0.5));

		System.out.printf(" The distance between the two given point is  : " + "%.4f", distance);

	}

}
