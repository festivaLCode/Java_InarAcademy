package Chapter04;

import java.util.Scanner;

public class Chapter04Q19 {

	public static void main(String[] args) {
		
		int checkSum;

		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the first 9 digit of ISBN-10 Number >>>");

		String number = keyboard.nextLine();

		char ch1 = number.charAt(0);
		char ch2 = number.charAt(2);
		char ch3 = number.charAt(4);
		char ch4 = number.charAt(6);
		char ch5 = number.charAt(8);
		char ch6 = number.charAt(10);
		char ch7 = number.charAt(12);
		char ch8 = number.charAt(14);
		char ch9 = number.charAt(16);

		if (number.length() != 16 || (ch1 < '0' && ch1 > '9') || (ch2 < '0' && ch2 > '9') || (ch3 < '0' && ch3 > '9')
				|| (ch4 < '0' && ch4 > '9') || (ch5 < '0' && ch5 > '9') || (ch6 < '0' && ch6 > '9')
				|| (ch7 < '0' && ch7 > '9') || (ch8 < '0' && ch8 > '9') || (ch9 < '0' && ch9 > '9')) {
			System.err
					.println("Invalid Input!!! Please enter Digits \"ONLY!\" (total 9 digits seperated by a space)  ");
			System.exit(1);
		}
		
		
	}

}
