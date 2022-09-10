package Chapter03;

import java.util.Scanner;

public class Chapter03Q05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Please enter today`s date . (Example: Monday(1) - Tuesday(2) -... Sunday(0)  ");
		int todaysDate = keyboard.nextInt();
		if ( todaysDate < 0 || todaysDate > 6) {
			System.out.println( " The input is Incorrect");
			System.exit(1);
		}

		System.out.println("  Please enter the number of the days after today");
		int upcomingDay = keyboard.nextInt();
		int futureDay = (todaysDate + upcomingDay) % 7;
		
		if (todaysDate == 1)
			System.out.println(" Today is Monday");
		 else if (todaysDate == 2) 
			System.out.println(" Today is  Tuesday");
		 else if (todaysDate == 3) 
			System.out.println(" Today is  Wednesday");
		 else if (todaysDate == 4) 
			System.out.println(" Today is  Thursday");
		 else if (todaysDate == 5) 
			System.out.println(" Today is  Friday");
		 else if (todaysDate == 6) 
			System.out.println(" Today is  Saturday");
		 else if (todaysDate == 0) 
			System.out.println(" Today is  sunday");
		else
			System.out.println(" Wrong input");

		if (futureDay == 1)
			System.out.println(" Future day is Monday");
		else if (futureDay == 2)
			System.out.println(" Future day is Tuesday");
		else if (futureDay == 3)
			System.out.println(" Future day is Wednesday");
		else if (futureDay == 4)
			System.out.println(" Future day is Thursday");
		else if (futureDay == 5)
			System.out.println(" Future day is Friday");
		else if (futureDay == 6)
			System.out.println(" Future day is Saturday");
		else if (futureDay == 0)
			System.out.println(" Future day is Sunday");
		else
			System.exit(1);
			
	}

}
