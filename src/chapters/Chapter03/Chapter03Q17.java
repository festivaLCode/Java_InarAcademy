package Chapter03;

import java.util.Scanner;

public class Chapter03Q17 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter 0, 1, or 2. (0 = Scissor || 1 = Rock  || 2 = Paper) ");
		int guess = keyboard.nextInt();

		if (guess != 0 && guess != 1 && guess != 2) {
			System.out.println(" Wrong Input!! ,please enter 0,1 or 2 ");
			System.exit(1);
		}
		int computer = (int) (Math.random() * 3);

		if (computer == 0 && guess == 0) {
			System.out.println(" The computer is scissor. You are also scissor.  You are tied!!");

		} else if (computer == 0 && guess == 1) {
			System.out.println(" The computer is scissor. You are ROCK.  You WON!!");

		} else if (computer == 0 && guess == 2) {
			System.out.println(" The computer is scissor. You are PAPER.  You LOST!!");

		} else if (computer == 1 && guess == 0) {
			System.out.println(" The computer is Rock. You are SCISSOR.  You  LOST!!");

		} else if (computer == 1 && guess == 1) {
			System.out.println(" The computer is Rock. You are also ROCK .  You are tied!!");

		} else if (computer == 1 && guess == 2) {
			System.out.println(" The computer is Rock. You are PAPER.  You WON!!");

		} else if (computer == 2 && guess == 0) {
			System.out.println(" The computer is Paper. You are  SCISSOR.  You WON!!");

		} else if (computer == 2 && guess == 1) {
			System.out.println(" The computer is Paper. You are ROCK.  You LOST!!");

		} else if (computer == 2 && guess == 2) {
			System.out.println(" The computer is Paper. You are also PAPER.  You are tied!!");
		} else {
			System.exit(1);
		}
	}

}
