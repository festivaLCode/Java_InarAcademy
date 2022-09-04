package Chapter02.Questions;

import java.util.Scanner;

/*
 *  Question : Find the population after each of 5 years, based on the fact that 
 *  1 birth/7sec
 *  1 death/13sec
 *  1 immigrant/45sec
 *  NOTE: Current Population : 312,032,486
 */
public class Chapter02Q11 {
	// Calculate total seconds in 1 year
	// Divide total seconds by each situation
	// Add/Subtract to find the total Population for each of the 5 year.
	public static void main(String[] args) {
		// 365 * 24 * 60 * 60 = 31,536,000 secs in 1 year
		System.out.println(" Total secs/ 7 = " + (int) (31536000.0 / 7) + " Birth each year");
		System.out.println(" Total secs/ 13 = " + (int) (31536000.0 / 13) + " Death each year");
		System.out.println(" Total secs/ 45 = " + (int) (31536000.0 / 45) + " Incoming Immigrant each year");

		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the number of years  : ");
		int numberOfYears = keyboard.nextInt();
		final int currentPopulation;
		currentPopulation = 312_032_486;

		double totalPopulation;

		totalPopulation = currentPopulation
				+ numberOfYears * ((31536000.0 / 7) + (31536000.0 / 45) - (31536000.0 / 13));
		System.out.printf("Population after  " + numberOfYears + "  years  " + "%.0f",totalPopulation);

	}

}
