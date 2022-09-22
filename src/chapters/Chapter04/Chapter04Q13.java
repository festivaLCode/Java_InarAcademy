package Chapter04;

import java.util.Scanner;

public class Chapter04Q13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter a letter :");

		String str = keyboard.next();

		char ch = str.charAt(0);
		if (str.length() >= 2) {
			System.err.println(" Please enter a letter !!!");
			System.exit(1);
		}

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel !!!");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(" Please enter a letter, not a DIGIT!!!");
		} else if (ch < 'A' || ch > 'z') {
			System.out.println(ch + " is an Invalid INPUT!!");
			System.exit(1);
		} else {
			System.out.println(ch + " is a consonant !! ");
		}
		System.exit(1);

	}

}
