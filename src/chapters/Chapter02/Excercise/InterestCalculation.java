package Chapter02.Excercise;

import java.util.Scanner;

public class InterestCalculation {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter annual rate(Ex: 4.5)   :");

		double annualRate = keyboard.nextDouble();

		System.out.println(" Select monthly time period(72 / 60 / 48 / 36 / 24) :");

		int timePeriod = keyboard.nextInt();

		System.out.println(" Enter the amount of loan :  ");

		double loanAmount = keyboard.nextDouble();

		double monthlyInterest = annualRate / 1200;

		double monthlyPayment = (loanAmount * monthlyInterest)
				/ (1 - (1 / (Math.pow(1 + monthlyInterest, timePeriod))));

		double totalLoanAmount = monthlyPayment * timePeriod;

		System.out.println(" Monthly Payment :   " + (int) (monthlyPayment * 100)/ 100.0 );
		System.out.println("  Total Loan Amount : "   + (int)(totalLoanAmount * 1000)/ 1000.0);

	}

}
