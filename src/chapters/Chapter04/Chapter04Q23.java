package Chapter04;

import java.util.Scanner;

public class Chapter04Q23 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print(" Please enter employee's name: ");
		String name = keyboard.nextLine();

		System.out.print(" Please enter the number of hours worked in a week : ");
		double hours = keyboard.nextDouble();

		System.out.print(" Please enter hourly pay rate : ");
		double payRate = keyboard.nextDouble();

		System.out.print(" Please enter federal tax withholding rate :  ");
		double federalTax = keyboard.nextDouble();

		System.out.print(" Please Enter state tax withholding rate  : ");
		double stateTax = keyboard.nextDouble();

		double grossPay = (payRate * hours);
		double totalDeduction = (grossPay * federalTax) + (grossPay * stateTax);

		System.out.println("                       ");

		System.out.printf("%1s\n ", " Employee name : " + name);
		System.out.printf("Hours Worked : " + hours + "\n");
		System.out.printf(" Pay Rate : " + "$" + payRate + "\n");
		System.out.printf(" Gross Pay: " + "$" + grossPay + "\n");
		System.out.printf(" Deductions :\n");
		System.out.printf("   Federal Witholding : " + "(" + (federalTax * 100) + ")" + " :" + "  $"
				+ (grossPay * federalTax) + "\n");
		double stateWitholding = (grossPay * stateTax) * 1000 /1000.0;

		System.out.printf("   State Witholding  :" + "(" + (stateTax * 100) + ")" + " :" + "  $" + stateWitholding + "\n");
		System.out.printf("   Total Deductions : " + "  $" + totalDeduction + "\n");
		System.out.printf(" Net Pay  :" + "%3.2f", (grossPay - totalDeduction));

	}

}
