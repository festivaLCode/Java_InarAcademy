package Chapter05;

import java.util.Scanner;

public class Chapter05Q01 {
	public static void main(String[] args) {

		int pos = 0;
		int neg = 0;
		double total = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer, the input ends if it is 0:  ");
		int number = keyboard.nextInt();

		if (number == 0) {
			System.out.println(" No numbers entered except 0 ");
			System.exit(1);
		}
		int count = 0;
		while (number != 0) {
			total += number;
			count++;

			if (number < 0) {
				neg++;
			}
			if (number > 0) {
				pos++;
			}
			number = keyboard.nextInt();

		}
	
		double average = (total / count * 1.0);

		System.out.println("The number of positives >>" + pos);
		System.out.println("The number of negatives >>" + neg);
		System.out.println("The total is  >>" + total);
		System.out.println("The average is  >>" + average);

	}
}
