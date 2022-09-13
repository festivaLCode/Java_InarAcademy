package Chapter03;

import java.util.Scanner;

public class Chapter03Q26 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter an integer ");

		int number = keyboard.nextInt();

		boolean fiveAndSix = (number % 5 == 0 && number % 6 == 0);

		boolean fiveOrSix = (number % 5 == 0 || number % 6 == 0);

		boolean onlyFiveOrSix = (number % 5 == 0 ^ number % 6 == 0);

		
			System.out.println(" Is " + number + " divisible by 5 and 6  ?" + fiveAndSix);
		
			System.out.println(" Is " + number + " divisible by 5 or 6  ?" + fiveOrSix);

			System.out.println(" Is " + number + " divisible by 5 or 6 but not both  ? " + onlyFiveOrSix);
		
	}

}
