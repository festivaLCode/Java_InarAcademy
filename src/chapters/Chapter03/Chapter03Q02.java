package Chapter03;

import java.util.Scanner;

public class Chapter03Q02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		int c = (int) (Math.random() * 10);

		int sum = a + b + c;

		System.out.println(" What is the sum for " + a + "  +  " + b + "  +  " + c + " ???  ");
		System.out.println(" Please enter  your  answer");
		int answer = keyboard.nextInt();

		if (sum == answer) {
			System.out.println("  Congratulations!!! Your answer is correct! ");

		} else {
			System.out.println(" SORRY!! Your answer is WRONG " + "The  Correct answer is  >>> " + sum  );
		}

	}

}
