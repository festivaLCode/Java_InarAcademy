package Chapter04;

import java.util.Scanner;

public class Chapter04Q22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Please enter String 1 : ");
		String str1 = input.nextLine();

		System.out.print(" Please enter String 2 : ");
		String str2 = input.nextLine();

		if (str1.contains(str2)) {
			System.out.println(str2 + " is a substring of " + str1);
		} else {
			System.out.println(str2 + " is not a substring of " + str1);
		}

	}

}
