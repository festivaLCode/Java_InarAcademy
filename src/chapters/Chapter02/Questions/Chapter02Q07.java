package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q07 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Enter the number of minutes  :");

		int minutes = keyboard.nextInt();
		// to find the years, use the formula : " ( minutes / (60 * 24 * 365) )

		double hours = minutes /60;
		double days = hours /24;
		double	years = days /365;	
		//Then to find the remaining days, we will find the mod 365 for the days
		double remainingDays = days % 365;	 	

		System.out.println(minutes + "  minutes is approximately equals to " + (int)years + 
				" years and " + (int)remainingDays + "  days");

	}

}
