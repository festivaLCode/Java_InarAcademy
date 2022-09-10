package Chapter03;

import java.util.Scanner;

public class Chapter03Q10 {
	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);


		
		System.out.println(number1 + "   +   " + number2 + "  ?  ");

		Scanner keyboard = new Scanner(System.in);
		int result = keyboard.nextInt();
		if (number1 + number2 == result) {
			System.out.println("  Congratulations, Correct Answer!!! ");
		} else {
			System.out.println("  Sorry! Wrong Answer >> Correct Answer  is : " + (number1 + number2));
		}
	}

}
