package Chapter04;

import java.util.Scanner;

public class Chapter04Q05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter the number of the sides of a polygon :");
		
		double n = input.nextDouble();
		System.out.println(" Please enter the length of the side of a polygon  :");
		double s= input.nextDouble();
		
		double a = Math.tan(Math.PI / n);
		double Area = (n * Math.pow(s,2) ) / (4 * a) ;
		
		System.out.printf(" The area of the polygon is " +  "%3.3f", Area  );
		
		
		
		

	}

}
