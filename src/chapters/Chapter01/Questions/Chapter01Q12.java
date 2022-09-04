package Chapter01.Questions;

public class Chapter01Q12 {
	// A runner runs 24 miles in 1hour 40mins 35 sec
	// We will calculate km per hour
	//Calculate average speed in KPH.
	
	
	public static void main(String[] args) {
		// 1 m = 1.6 km

		// We will convert miles to  by km by " miles *  1.6 "

		/*
		 * We will convert minutes to seconds then seconds to hour by using the formula
		 * of " minutes * 60 = total seconds"
		 * 
		 * * 1 min =60 seconds and in 1 hour>>>>> "60  * 60 = 3600" there are total of
		 * 3600 seconds Then we will convert seconds to hour(s) by using the formula of
		 * " total seconds/3600 "
		 * 
		 * Then we will calculate km per hour by " km/ hours"
		 */

		System.out.println(" Convert 14 miles to km = "  + (14  * 1.6) + "  km");
		// 1 hour is 60 minutes and 1 hour 45 minutes = 105 minutes
		System.out.println(" Convert 1 hour 45 minutes and 35 sec(s) to total seconds  =" + ((105 * 60) + 35) + " secs"
				+ "\nSeconds to Hours  >>> =" + " total seconds/3600 = " + ( ((105 * 60) + 35)/ 3600.0) + "  hours ");
		System.out.println(" Find Avarage Speed" + "\nKilometers Per Hour =KPH" + "\n(14 * 1.6)   /  ((105 * 60) + 35)/3600)  = "
				+ (14 / 1.6) / (((105 * 60) + 35.0) / 3600) + "  KPH");
	}
}
