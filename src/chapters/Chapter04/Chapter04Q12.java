package Chapter04;

import java.util.Scanner;

public class Chapter04Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter a Hex digit");

		String str = input.next();

		if (str.length() != 1) {
			System.err.println(" Enter only 1 Character ");
			System.exit(1);

		}

		char ch = str.toUpperCase().charAt(0);

		if (ch == '0') {
			System.out.println(" The binary value for " + ch + " is  0000");
		} else if (ch == '1') {
			System.out.println(" The binary value for " + ch + " is  0001");
		} else if (ch == '2') {
			System.out.println(" The binary value for " + ch + " is  0010");
		} else if (ch == '3') {
			System.out.println(" The binary value for " + ch + " is  0011");
		} else if (ch == '4') {
			System.out.println(" The binary value for " + ch + " is  0100");
		} else if (ch == '5') {
			System.out.println(" The binary value for " + ch + " is  0101");
		} else if (ch == '6') {
			System.out.println(" The binary value for " + ch + " is  0110");
		} else if (ch == '7') {
			System.out.println(" The binary value for " + ch + " is  0111");
		} else if (ch == '8') {
			System.out.println(" The binary value for " + ch + " is  1000");
		} else if (ch == '9') {
			System.out.println(" The binary value for " + ch + " is  1001");
		} else if (ch == 'A') {
			System.out.println(" The binary value for " + ch + " is  1010");
		} else if (ch == 'B') {
			System.out.println(" The binary value for " + ch + " is  1011");
		} else if (ch == 'C') {
			System.out.println(" The binary value for " + ch + " is  1100");
		} else if (ch == 'D') {
			System.out.println(" The binary value for " + ch + " is  1101");
		} else if (ch == 'E') {
			System.out.println(" The binary value for " + ch + " is  1110");
		} else if (ch == 'F') {
			System.out.println(" The binary value for " + ch + " is  1111");
		} else
			System.err.println(" Invalid Input!! Please enter an HEX Digit !!! ");
		System.exit(1);

	}

}
