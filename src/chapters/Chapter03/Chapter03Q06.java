package Chapter03;
import java.util.Scanner;

public class Chapter03Q06 {

	private static final String BMI = null;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please enter your weight in pounds : ");
		double pounds = keyboard.nextDouble();
		// If you are 5"10 , please enter your height and inches separately.
		System.out.println(" Please enter your height in feet : ");
		double feet = keyboard.nextDouble();
		
		System.out.println(" Please enter your height in inches(Remaining part after feet) : ");
		double inches = keyboard.nextDouble();
		
		// Body Mass Index = BMI = kg / m  * m
		double kilogram = pounds * 0.454;
		double meter = ( feet * 0.3048 ) + (inches * 0.0254);
		
		double BMI = kilogram / ( meter * meter );
		
		if (BMI < 18.5) {
			System.out.println( " Your BMI is >>> :  " + BMI + " You  are underweight ");
		}else if (BMI >= 18.5  && BMI <25 ) {
			System.out.printf( " Your BMI is >>> :  " +  BMI + " You are Normal ");
		}else if ( BMI >= 25   &&  BMI < 30) {
			System.out.println( " Your BMI is >>> :  " + BMI +  " You are overweight");
		}else if (BMI >= 30) {
			System.out.println(" Your BMI is >>> :  " + BMI + " You are obese ");
		}
		System.exit(1);
		

	}

}
