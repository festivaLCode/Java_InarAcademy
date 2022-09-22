package Chapter04;

import java.util.Scanner;

public class Chapter04Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Please enter a character : ");

		char ch = input.next().charAt(0);

		int number = ch;

		System.out.println(" The Unicode for the character " + ch + " is " + number);

	}

}
