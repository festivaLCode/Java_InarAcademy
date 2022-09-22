package Chapter04;

import java.util.Scanner;

public class Chapter04Q08 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" Please enter ASCII code : ");

		int unicode = keyboard.nextInt();

		char value = (char) unicode;

		if (unicode < 0 || unicode > 127) {
			System.out.println(" Please enter a value between 0 and 127 ");
			System.exit(1);
		} else {

			System.out.println("The character for ASCII code  " + unicode + " is  " + value);
		}
	}

}
