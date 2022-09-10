package Chapter03;

import java.util.Scanner;

public class Chapter03Q09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the first 9 digit of ISBN-10 Number >>>");

		int d1 = keyboard.nextInt();
		int d2 = keyboard.nextInt();
		int d3 = keyboard.nextInt();
		int d4 = keyboard.nextInt();
		int d5 = keyboard.nextInt();
		int d6 = keyboard.nextInt();
		int d7 = keyboard.nextInt();
		int d8 = keyboard.nextInt();
		int d9 = keyboard.nextInt();

		// check Sum = d10

		int checkSum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8)
				+ (d9 * 9)) % 11;

		if (d1 < 0 || d1 > 9 || d2 < 0 || d2 > 9 || d3 < 0 || d3 > 9 || d4 < 0 || d4 > 9 || d5 < 0 || d5 > 9 || d6 < 0
				|| d6 > 9 || d7 < 0 || d7 > 9 || d8 < 0 || d8 > 9 || d9 < 0 || d9 > 9) {
			System.out.println(
					" Invalid Entry: One ore More of Your Digits are not valid " + "\n Please Check your Digit(s)");

			System.exit(1);
		}

		if (checkSum == 10) {
			System.out.println(" The ISBN-10 Number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
					+ d7 + "" + d8 + "" + d9 + "X");
		} else {
			System.out.println(" The ISBN-10 Number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
					+ d7 + "" + d8 + "" + d9 + "" + checkSum);
		}

	}

}
