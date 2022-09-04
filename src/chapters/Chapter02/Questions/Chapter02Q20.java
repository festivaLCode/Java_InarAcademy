package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter the balance and annual interest rate ");

		double balance = keyboard.nextDouble();
		double annualInterestRate = keyboard.nextDouble();

		double interest;
		interest = balance * (annualInterestRate / 1200);

		System.out.printf(" The interest for the next month is   " + "%.5f", interest);

	}

}
