package Chapter04;

import java.util.Scanner;

public class Chapter04Q21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter your SSN number in this format >>(111-11-1111) : ");

		String number = input.nextLine();

		char ch1 = number.charAt(0);
		char ch2 = number.charAt(1);
		char ch3 = number.charAt(2);
		char ch4 = number.charAt(3);
		char ch5 = number.charAt(4);
		char ch6 = number.charAt(5);
		char ch7 = number.charAt(6);
		char ch8 = number.charAt(7);
		char ch9 = number.charAt(8);
		char ch10 = number.charAt(9);
		char ch11 = number.charAt(10);

		if (number.length() != 11 || (ch1 < '0' && ch1 > '9') || (ch2 < '0' && ch2 > '9') || (ch3 < '0' && ch3 > '9')
				|| (ch4 < '0' && ch4 > '9') || (ch5 < '0' && ch5 > '9') || (ch6 < '0' && ch6 > '9')
				|| (ch7 < '0' && ch7 > '9') || (ch8 < '0' && ch8 > '9') || (ch9 < '0' && ch9 > '9')
				|| (ch10 < '0' && ch10 > '9') || (ch11 < '0' && ch11 > '9')) {
			System.err.println(number + " is an Invalid SSN number!!!\n " + "Please enter exact amount of Digits \"ONLY!\" "
					+ "(total 9 digits seperated by a space)  ");
			System.exit(1);

		}

	}

}
