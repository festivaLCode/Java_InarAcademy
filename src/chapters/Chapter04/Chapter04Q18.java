package Chapter04;

import java.util.Scanner;

public class Chapter04Q18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" Please enter two characters : ");
		// M: Mathematics
		// C: Computer Science
		// I: Information Technology
		// 1 : Freshman || 2 : Sophomore || 3: Junior || 4 : Senior

		String str = keyboard.next();
		char ch = str.charAt(0);
		char ch1 = str.charAt(1);

		if (ch == 'M' && ch1 == '1') {
			System.out.println(" Mathematics Freshman ");
		} else if (ch == 'M' && ch1 == '2') {
			System.out.println(" Mathematics Sophomore");
		} else if (ch == 'M' && ch1 == '3') {
			System.out.println(" Mathematics Junior ");
		} else if (ch == 'M' && ch1 == '4') {
			System.out.println(" Mathematics Senior ");
		} else if (ch == 'C' && ch1 == '1') {
			System.out.println(" Computer Science Freshman ");
		} else if (ch == 'C' && ch1 == '2') {
			System.out.println(" Computer Science Sophomore ");
		} else if (ch == 'C' && ch1 == '3') {
			System.out.println(" Computer Science Junior ");
		} else if (ch == 'C' && ch1 == '4') {
			System.out.println(" Computer Science Senior ");
		} else if (ch == 'I' && ch1 == '1') {
			System.out.println(" Information Technology Freshman ");
		} else if (ch == 'I' && ch1 == '2') {
			System.out.println(" Information Technology Sophomore ");
		} else if (ch == 'I' && ch1 == '3') {
			System.out.println(" Information Technology Junior ");
		} else if (ch == 'I' && ch1 == '4') {
			System.out.println(" Information Technology Senior ");
		} else {
			System.err.println("INVALID INPUT!!!  \nPlease enter M,C, or I and 1,2,3, or 4  Example (M1, C3 , I4 )");
			System.exit(1);
		}

	}

}
