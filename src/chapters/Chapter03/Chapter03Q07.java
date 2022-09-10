package Chapter03;

import java.util.Scanner;

public class Chapter03Q07 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter the exact amount of money $$$ ");
		double money = keyboard.nextDouble();
		int cents = (int) (money * 100);

		System.out.println(" The money you entered in cent =  " + cents + " cents");

		int dollars = (cents / 100);
		if (dollars != 0)
			System.out.println(" Your amount consists of " + dollars + (dollars == 1 ? "dollar " : " dollars" ));

		int quarters = (cents - dollars * 100) / 25;
		if (quarters != 0)
			System.out.println(" Your amount consists of " + quarters + ( quarters == 1 ? "quarter" : " quarters"));

		int dimes = (((cents - dollars * 100) - quarters * 25) / 10);
		if (dimes != 0)
			System.out.println(" Your amount consists of " + dimes + ( dimes == 1 ? "dime" : " dimes"));

		int nickels = (((cents - dollars * 100) - quarters * 25) - dimes * 10) / 5;
		if (nickels != 0)
			System.out.println(" Your amount consists of " + nickels + (nickels == 1 ? " nickel" : " nickels" ));

		int pennies = (((((cents - dollars * 100) - quarters * 25) - dimes * 10) - nickels * 5) / 1);
		if (pennies != 0)
			System.out.println(" Your amount consists of " + pennies +(pennies == 1 ? "pennie" : " pennies" ));

		System.exit(1);

	}

}
