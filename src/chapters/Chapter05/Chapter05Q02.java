package Chapter05;

import java.util.Scanner;

public class Chapter05Q02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		String report = " ";
		int wrongAnswer = 0;
		int correctAnswer = 0;

		for (int i = 1; i < 11; i++) {
			int a = (int) (Math.random() * 15 + 1);
			int b = (int) (Math.random() * 15 + 1);

			System.out.println(" " + a + " + " + b + "  ? ");

			System.out.println("Please submit your answer ??? ");
			int answer = keyboard.nextInt();
			int result = a + b;
			if (answer != result) {
				System.err.println(" Sorry!!! WRONG ANSWER ");
				wrongAnswer++;
				report += "  " + a + " + " + b + "  = " + answer + " WRONG ANSWER!!\n";

			} else if (answer == result) {
				System.out.println(" Congratulations, CORRECT ANSWER!!! ");
				correctAnswer++;
				report += "  " + a + " + " + b + "  = " + answer + " CORRECT ANSWER!!\n";

			}

		}
		System.out.println(" Total correct answer(s) are :  " + correctAnswer);
		System.out.println(" Total wrong answer(s) are :  " + wrongAnswer);
		long endTime = System.currentTimeMillis();
		long totalTime = ((endTime - startTime) / 1000) % 60;
		System.out.println(" Total time spent  " + totalTime + " sec(s) ");
		System.out.println(report);

	}

}
