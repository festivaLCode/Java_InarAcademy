package Chapter03;

import java.util.Scanner;

public class Chapter03Q13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter your filing status by using prompted codes");
		// Enter 0 for " SINGLE "
		// Enter 1 for " MARRIED FILING JOINTLY/ QUALIFIED WIDOW(ER) "
		// Enter 2 for " MARRIED FILING SEPERATELY"
		// Enter 3 for " HEAD OF HOUSEHOLD"
		int filingStatus = keyboard.nextInt();
		System.out.println(" Please enter your taxable income");
		int taxableIncome = keyboard.nextInt();

		
			if (taxableIncome < 0 ) {
				System.out.println(" Invalid Income Value ");
				System.exit(1);
				}
			if (filingStatus == 0) {
			if (taxableIncome <= 8350)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.10));
			else if (taxableIncome <= 33950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.15));
			else if (taxableIncome <= 82250)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.25));
			else if (taxableIncome <= 171550)
				System.out.println(" Your Personal Income Tax is  : " + (int) (taxableIncome * 0.28));
			else if (taxableIncome <= 372950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.33));
			else
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.35));
		}
		if (filingStatus == 1) {
			if (taxableIncome <= 16700)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.10));
			else if (taxableIncome <= 67900)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.15));
			else if (taxableIncome <= 137050)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.25));
			else if (taxableIncome <= 208850)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.28));
			else if (taxableIncome <= 372950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.33));
			else
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.35));
		}
		if (filingStatus == 2) {
			if (taxableIncome <= 8350)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.10));
			else if (taxableIncome <= 33950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.15));
			else if (taxableIncome <= 68525)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.25));
			else if (taxableIncome <= 104425)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.28));
			else if (taxableIncome <= 186475)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.33));
			else
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.35));
		}
		if (filingStatus == 3) {
			if (taxableIncome <= 11950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.10));
			else if (taxableIncome <= 45500)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.15));
			else if (taxableIncome <= 117450)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.25));
			else if (taxableIncome <= 190200)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.28));
			else if (taxableIncome <= 372950)
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.33));
			else
				System.out.println(" Your Personal Income Tax is  : " + (taxableIncome * 0.35));
		} else {
			System.out.println( " Ivalid Prompt Code ");
			System.exit(1);

		}
	}

}
