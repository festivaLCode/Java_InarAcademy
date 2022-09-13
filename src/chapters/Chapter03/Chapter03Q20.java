package Chapter03;

import java.util.Scanner;

public class Chapter03Q20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// ta = outside temperature
		// v = wind speed mph
		// twc = wind chill temperature
		System.out.println(" Please enter the outside temperature between -58 F and 41 F :");

		double ta = keyboard.nextDouble();
		if (ta <= -58 || ta > 41) {
			System.out.println(" The temperature you entered is invalid, Please enter a value between -58 and 41 ");
			System.exit(1);
		}
		System.out.println(" Please enter the wind speed (>=2) in mph  :");
		double v = keyboard.nextDouble();

		if (v < 2) {
			System.out.println(" The wind speed you entered is invalid, Please enter a value greater than 2 ");
			System.exit(1);
		}

		// wch = wind chill index
		double wch = 35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v, 0.16))) + ((0.4275) * (ta) * (Math.pow(v, 0.16)));

		System.out.printf(" The wind chill index for given temperature is  : " + "%.5f", wch);

	}
}
