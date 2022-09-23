package Chapter04;

import java.util.Scanner;

public class Chapter04Q15 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" Please enter a letter :");

		String str = keyboard.next();
		char ch = str.charAt(0);

		if (str.length() != 1) {
			System.err.println( str + " is an Invalid Input!!");
			System.exit(1);
		}

		if (ch == 'a' || ch == 'A' || ch == 'b' || ch == 'B' || ch == 'c' || ch == 'C') {
			System.out.println(" The corresponding number is 2 ");
		} else if (ch == 'd' || ch == 'D' || ch == 'e' || ch == 'E' || ch == 'f' || ch == 'F') {
			System.out.println(" The corresponding number is 3 ");
		} else if (ch == 'g' || ch == 'G' || ch == 'h' || ch == 'H' || ch == 'i' || ch == 'I') {
			System.out.println(" The corresponding number is 4 ");
		} else if (ch == 'j' || ch == 'J' || ch == 'k' || ch == 'K' || ch == 'l' || ch == 'L') {
			System.out.println(" The corresponding number is 5 ");
		} else if (ch == 'm' || ch == 'M' || ch == 'n' || ch == 'N' || ch == 'o' || ch == 'O') {
			System.out.println(" The corresponding number is 6 ");
		} else if (ch == 'p' || ch == 'P' || ch == 'q' || ch == 'Q' || ch == 'r' || ch == 'R' || ch == 's'
				|| ch == 'S') {
			System.out.println(" The corresponding number is 7 ");
		} else if (ch == 't' || ch == 'T' || ch == 'u' || ch == 'U' || ch == 'v' || ch == 'V') {
			System.out.println(" The corresponding number is 8 ");
		} else if (ch == 'w' || ch == 'W' || ch == 'x' || ch == 'X' || ch == 'y' || ch == 'Y' || ch == 'z'
				|| ch == 'Z') {
			System.out.println(" The corresponding number is 9 ");
		} else {
			System.err.println(ch + " is an Invalid Input !! ");
			System.exit(1);
		}

	}

}
