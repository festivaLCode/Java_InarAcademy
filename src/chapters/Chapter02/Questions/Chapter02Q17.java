package Chapter02.Questions;
import java.util.Scanner;

public class Chapter02Q17 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// ta = outside temperature
		// v  = wind speed mph
		// twc = wind chill temperature 
		System.out.println(" Please enter the outside temperature between -58 F and 41 F :");
		
		double ta = keyboard.nextDouble();
		
		System.out.println(" Please enter the wind speed (>=2) in mph  :");
		
		double v = keyboard.nextDouble();
		 
		// wch = wind chill index
		double wch = 35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v,0.16))) +( (0.4275) * (ta) * (Math.pow(v,0.16)) );
		
		System.out.printf(" The wind chill index for given temperature is  : " + "%.5f",wch );
		
	}
}
