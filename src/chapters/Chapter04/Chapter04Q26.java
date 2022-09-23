package Chapter04;

import java.util.Scanner;

public class Chapter04Q26 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double (example 11.56)  : ");

		String amount = input.next();
		if (amount.length() != 5) {
			System.err.println("Please enter an amount with the format ##.## ie 11.56");
			System.exit(0);
		}
		double doubleAmount = Double.parseDouble(amount);
		String amountOfDollars = amount.substring(0, amount.indexOf("."));

		System.out.println("The amount of dollars are " + "$" + amountOfDollars);

		String amountOfCents = amount.substring(3, 5);
		System.out.println("The amount of cents are " + amountOfCents + " cents");

		Integer change = Integer.parseInt(amountOfCents);

		int numQuarter = change / 25;
		change %= 25;
		int dime = change / 10;
		change %= 10;
		int nickel = change / 5;
		change %= 5;
		int penny = change;

		String numberOfQuarters = String.valueOf(numQuarter);
		String numberOfDimes = String.valueOf(dime);
		String numberOfNickels = String.valueOf(nickel);
		String numberOfPennies = String.valueOf(penny);

		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + amountOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

	}
}
