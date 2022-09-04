package Chapter01.Questions;

/*
 *  Question : Find the population after each of 5 years, based on the fact that 
 *  1 birth/7sec
 *  1 death/13sec
 *  1 immigrant/45sec
 *  NOTE: Current Population : 312,032,486
 */
public class Chapter01Q11 {
	// Calculate total seconds in 1 year
	// Divide total seconds by each situation
	// Add/Subtract to find the total Population for each of the 5 year.
	public static void main(String[] args) {
		// 365 * 24 * 60 * 60 = 31,536,000 secs in 1 year
		System.out.println(" Total secs/ 7 = " + (int)(31536000.0 / 7) + " Birth each year");
		System.out.println(" Total secs/ 13 = " + (int)(31536000.0 / 13) + " Death each year");
		System.out.println(" Total secs/ 45 = " + (int)(31536000.0 / 45) + " Incoming Immigrant each year");

		System.out.println(" (Birth Each Year) + (Immigrant Each Year) - (Death Each Year)  ="
				+  (((int)(31536000.0 / 7) + (int)(31536000.0 / 45) - (int)(31536000.0 / 13)) + "  = Total Change in 1 Year "));
		System.out.println(" Current Population + Change After 1 YEAR >>>>   =  "
				+ (312_032_486 + (31536000 / 7) + (31536000 / 45) - (31536000 / 13))
				+ "          Population After the 1st Year");
		System.out.println(" Current Population + Change After 2 YEARS >>>>  =  "
				+ (312_032_486 + (2 * ((31536000 / 7) + (31536000 / 45) - (31536000 / 13))))
				+ "          Population After the 2nd Year");
		System.out.println(" Current Population + Change After 3 YEARS >>>>  =  "
				+ (312_032_486 + (3 * ((31536000 / 7) + (31536000 / 45) - (31536000 / 13))))
				+ "          Population After the 3rd Year");
		System.out.println(" Current Population + Change After 4 YEARS >>>>  =  "
				+ (312032486 + (4 * ((31536000 / 7) + (31536000 / 45) - (31536000 / 13))))
				+ "          Population After the 4th Year");
		System.out.println(" Current Population + Change After 5 YEARs >>>>  =  "
				+ (312032486 + (5 * ((31536000 / 7) + (31536000 / 45) - (31536000 / 13))))
				+ "         Population After the 5th Year");

	}

}
