package Chapter04;

import java.util.Scanner;

public class Chapter04Q20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" Please enter a String : ");

		String str = keyboard.nextLine();

		System.out.println(" The length of the String is " + str.length());
		System.out.println(" The first character of the String is " + str.charAt(0));

	}
}
