package Chapter04;

import java.util.Scanner;

public class Chapter04Q17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter a year :  ");
		int year = input.nextInt();

		System.out.print(" Please enter the first three letters of the month :  ");

		String month = input.next();

		char ch = month.charAt(0);
		char ch1 = month.charAt(1);
		char ch2 = month.charAt(2);

		if (month.length() != 3 || ch < 'A' || ch > 'Z' || ch1 >= 'A' && ch1 <= 'Z' || ch2 >= 'A' && ch2 <= 'Z') {
			System.err.println(" Please enter 3 letters of the month with \"ONLY\" the first letter in UPPERCASE !!!");
			System.exit(1);

		} else if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.println(" " +month + " " + year + " has  31 days !!");

		} else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.println(month + " " + year + " has  30 days !!");

		} else if (month.equals("Feb") && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(month + " " + year + " has  29 days !!");

		} else if (month.equals("Feb")) {
			System.out.println(month + " " + year + " has  28 days !!");

		} else {
			System.err.println(" Invalid  INPUT !!!");

		}

	}
}
