package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q23 {
	// We will find cost of driving
	// We will check how many gallons we need by Distance/ milesPerGallon
	// Then we will find the cost by multiplying pricePerGallon and gallons needed
	// for the trip

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter the driving distance  : ");
		double distance = keyboard.nextDouble();

		System.out.println(" Enter miles per gallon  : ");
		// mpg = miles per gallon for the specific vehicle
		double mpg = keyboard.nextDouble();

		System.out.println(" Enter average price per gallon  : ");
		double pricePerGallon = keyboard.nextDouble();

		double tripCost;
		// (distance / mpg) will give me how many gallons I needed

		tripCost = (distance / mpg) * pricePerGallon;

		System.out.printf(" The cost of driving for the trip is : " + "%.2f", tripCost);

	}

}
