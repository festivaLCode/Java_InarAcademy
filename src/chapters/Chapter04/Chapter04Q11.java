package Chapter04;

import java.util.Scanner;

public class Chapter04Q11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter a decimal integer between 0 and 15 ");
		int number = input.nextInt();
		if (number < 0 || number >= 15) {
			System.out.println(" Please enter a value between 0 and 15\n " + number + " is an INVALID INPUT ");
			System.exit(1);
		} else if (number >= 0 && number < 10) {
			System.out.println(" The hex value is " + number);

		} else if (number == 10) {
			System.out.println(" The hex value is A ");
		} else if (number == 11) {
			System.out.println(" The hex value is B ");
		} else if (number == 12) {
			System.out.println(" The hex value is C ");
		} else if (number == 13) {
			System.out.println(" The hex value is D ");
		} else if (number == 14) {
			System.out.println(" The hex value is E ");
		} else if (number == 15) {
			System.out.println(" The hex value is F ");

		}
	}

}
