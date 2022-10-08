package Chapter05;

import java.util.Scanner;

public class Chapter05Q08 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double highScore = 0;

		System.out.print(" Please enter the number of students : ");
		int numberOfStudents = keyboard.nextInt();

		System.out.print(" Please enter a student name ");
		String names = keyboard.next();

		System.out.print(" Please enter the student's score ");
		double scores = keyboard.nextDouble();

		double highscore = 0;
		String studentName = " ";
		double tempScore = 0;
		String tempName = " ";

		while (numberOfStudents > 1) {

			System.out.print("Enter a student name: ");
			tempName = keyboard.next();

			System.out.print("Enter the students score: ");
			tempScore = keyboard.nextDouble();

			if (tempScore > highScore)
				highScore = tempScore;
			studentName = tempName;

			numberOfStudents--;
		}
		System.out.println("Top student " + studentName + "'s score is " + highScore);

	}

}
