package Chapter03;

import java.util.Scanner;

public class Chapter03Q12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter a 3 digit number ");
		System.out.println(" Let`s see if it is a Palindrome number .....");

		// A number is palindrome if it reads the same from right to left and from left
		// to right.

		int number = keyboard.nextInt();
		if (number < 100 || number > 1000) {
			System.out.println(" Wrong input, Please check your number and enter a 3 digit number ");
			System.exit(1);
		}

		int ones;
		int tens;
		int hundreds;

		hundreds = number / 100;
		tens = (number - hundreds * 100) / 10;
		ones = (number - hundreds * 100) % 10;

		if (ones == hundreds || hundreds == ones) {
			System.out.println(" The number you entered " + (number) + "  is a Palindrome number ");
		}else
			System.out.println("  The number you entered " + (number) + "  is not  a Palindrome number ");
		System.exit(1);

	}

}
