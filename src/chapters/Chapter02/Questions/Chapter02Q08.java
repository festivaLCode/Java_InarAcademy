package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q08 {
	public static void main(String[] args) {
		long totalMiliSeconds = System.currentTimeMillis();
		
	// total miliSeconds give us the time since 1/1/1970
	// the calculation is based on 24H Format	
		
		long totalSeconds = totalMiliSeconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes  = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24	;	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter your time zone offset to GMT : ");
		int timeZone = keyboard.nextInt();
		 
		System.out.println(" Your current local time is " + (currentHour + (timeZone)) + 
				" : " + currentMinutes + " : " + currentSecond	);
	}

}
