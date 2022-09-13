package Chapter03;

import java.util.Scanner;

public class Chapter03Q31 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Enter the exchange rate from dollars to RMB >>> : ");
		double rate = keyboard.nextDouble();

		System.out.println(" Please enter 0 for Dollars to RMB or enter 1 for RMB to Dollars : ");

		int userChoice = keyboard.nextInt();

		if (userChoice < 0 || userChoice > 1) {
			System.out.println(" Please enter a valid value for Converting ( Enter 0 or 1)");
			System.exit(1);
		}
		if (userChoice == 0) {
			System.out.println(" Please enter the dollar amount  ");
			double dollarAmount = keyboard.nextDouble();
			System.out.println("$" + dollarAmount + " is  " + (dollarAmount * rate) + " Yuan ");
		} else if (userChoice == 1) {
			System.out.println(" Please enter the RMB amount  ");
			double rmbAmount = keyboard.nextDouble();
			System.out.printf(rmbAmount + " Yuan   is  " + (rmbAmount / rate) + " Dollars ");
		}
		System.exit(1);

	}

}
