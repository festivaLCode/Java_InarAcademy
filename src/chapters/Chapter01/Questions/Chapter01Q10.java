package Chapter01.Questions;

public class Chapter01Q10 {

	// We will calculate miles per hour
	public static void main(String[] args) {
		// 1 mile = 1.6 km

		/*
		 * The Question is A runner runs 14 kilometers in 45 minutes and 30 seconds 
		 * We will find the avarage speed of the runner miles per hour
		 */

		// We will convert km to miles by using "km / 1.6"

		/*
		 * We will convert minutes to seconds then seconds to hour by using the formula
		 * of " minutes * 60 = total seconds"
		 * 
		 * * 1 min =60 seconds and in 1 hour>>>>> "60  * 60 = 3600" there are total of
		 * 3600 seconds Then we will convert seconds to hour(s) by using the formula of
		 * " total seconds/3600 "
		 * 
		 * Then we will calculate miles per hour by " miles/ hours"
		 */

		System.out.println(" Convert 14 km to miles = " + (14 / 1.6) + "  miles");
		System.out.println(" Convert  45 minutes and 30 sec(s) to total seconds  =" + ((45 * 60) + 30) + " sec"
				+ "\nSeconds to Hours" + " 2730/3600 = " + (2730.0 / 3600.0) + "  hours ");
		System.out.println(" Find Avarage Speed" + "\nMiles Per Hour =MPH" + "\n(14/1.6)/((45 * 60) + 30)/3600)  = "
				+ (14 / 1.6) / (((45 * 60) + 30.0) / 3600) + "  MPH");

	}

}
