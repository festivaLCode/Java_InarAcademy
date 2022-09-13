package Chapter03;
import java.util.Scanner;

public class Chapter03Q18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("  Please enter the weight of the package >>>");
		double weight = keyboard.nextDouble();
		
		if( weight > 50) {
			System.out.println( " Package cannot be shipped");
			System.exit(1);
		}
		if (weight > 0 && weight <= 1) {
			System.out.println(" The shipping cost is  $3.5 ");
		}else if (weight > 1 && weight <= 3) {
			System.out.println(" The shipping cost is  $5.5 ");
		}else if (weight > 3 && weight <= 10) {
			System.out.println(" The shipping cost is  $8.5 ");
		}else if (weight > 10 && weight <= 50) {
			System.out.println(" The shipping cost is  $10.5 ");
		}else {
			System.exit(1);
		}
	}

}
