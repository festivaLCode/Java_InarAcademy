package Chapter02.Questions;
import java.util.Scanner;

public class Chapter02Q10 {

	public static void main(String[] args) {
		// m = the weight of water in kg
		// q = measurement in joules
		// formula to use = q = m  * (finalTemperature - initialTemperature) * 4184
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the amount of water  : ");
		double m = keyboard.nextDouble();
		System.out.println(" Please enter the initial temperature  : ");
		double initialTemp = keyboard.nextDouble();
		System.out.println(" Please enter the final temperature  : ");
		double finalTemp = keyboard.nextDouble();
		
		double q = m * (finalTemp - initialTemp ) * 4184 ;
		
		System.out.printf(" The energy needed is : %.3f ", q);
		

	}

}
