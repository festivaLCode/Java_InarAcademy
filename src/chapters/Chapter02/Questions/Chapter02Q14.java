package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// We will calculate Body Mass Index (BMI)
		// We will use the formula of " BMI = Weight(kg)/(Height(m)^2)
		System.out.println(" Please enter your weight in pounds :");
		double weightPounds = keyboard.nextDouble();
		System.out.println(" Please enter your height in inches :");
		double heightInches = keyboard.nextDouble();
		double kilo;
		double meter;

		kilo = weightPounds * 0.45359237;
		meter = heightInches * 0.0254;

		double BMI;

		BMI = kilo / (meter * meter);

		System.out.printf("  BMI is  " + "%.4f", BMI);

	}

}
