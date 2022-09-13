package Chapter03;

import java.util.Scanner;

public class Chapter03Q21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter a year (Example : 2011 )>>>");
		int year = keyboard.nextInt();
		if (year < 0) {
			System.out.println(" Please enter a valid value for the year ( year >=0 ");
			System.exit(1);
		}

		System.out.println(" Please enter a month (1-January || 2- February || 3- March....  || 12 -December >>>");
		int month = keyboard.nextInt();

		if (month < 1 || month > 12) {
			System.out.println(" Please enter a valid value for the month  (1-12) ");
			System.exit(1);
		}

		System.out.println(" Please enter a valid day of the month (1-31) >>>");
		int dayOfTheMonth = keyboard.nextInt();
		// q is the day of the month
		// h is the day of the week
		if (dayOfTheMonth < 1 || dayOfTheMonth > 31) {
			System.out.println(" Please enter a valid value for the day of the month (1-31) ");
			System.exit(1);
		}

		int h; // h = dayOfTheWeek (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:Wednesday, 5: Thursday, 6: Friday)

		int j; // j is the century

		int k; // year of the century >>> (k = year % 100)

	}

}
