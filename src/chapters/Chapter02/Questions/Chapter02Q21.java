package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q21 {
	// We will calculate the future investment value
	// We will use the formula of " futureInvestmentAmount = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

	public static void main(String[] args) {
		Scanner keyboard=  new Scanner(System.in);
		
		System.out.println(" Please enter investment amount");
		double investmentAmount = keyboard.nextDouble();
		
		System.out.println(" Please enter annual interest rate in percentage");
		double annualInterestRate = keyboard.nextDouble();
		double monthlyInterestRate ;
		
		System.out.println(" Please enter the number of years");
		int numberOfYears = keyboard.nextInt();
		
		double futureInvestmentValue;
		
		monthlyInterestRate = annualInterestRate / 1200;
		futureInvestmentValue = investmentAmount * ( Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)) );
		
		System.out.printf(" Accumulated value is " + "%.2f", futureInvestmentValue );
		
	}

}
