package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q05 {
	public static void main(String[] args) {
		// We will get a integer value and convert feet into meters

		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please Enter the subtotal");
		double s = keyboard.nextDouble();
		System.out.println(" Please Enter the gratuity rate %");
		// s= subtotal
		// g = gratuity

		double gratuityRate = keyboard.nextDouble();

		double g = s * (gratuityRate / 100);
		double total = s + g;

		System.out.println("The gratuity is equal to   " + g + "\nThe total is equal to  " + total);
	}

}