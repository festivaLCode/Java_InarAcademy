package Chapter05;

import java.util.Scanner;

public class Chapter05Q17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the number of lines (1- 15) ");
		int number = input.nextInt();

		for (int i = 2; i <= number; i++) {
			if (i <= number) {
				System.out.print(" " + i);
			} else {
				break;
			}

		}

	}
}
