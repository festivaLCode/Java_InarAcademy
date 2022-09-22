package Chapter04;

import java.util.Scanner;

public class Chapter04Q01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println(" Please enter the length from center the vertex  : ");
		
		double length = keyboard.nextDouble();
		double r= length;
		
		// Area = (5 * (s * s) ) / 4 * tan(PI / 5 ) 
		// s =  2 * r * sin( PI /5)
		
		double a = Math.sin(Math.PI / 5);
		double b= Math.tan(Math.PI / 5);
		
		double side;
		
		side = 2 * r * a ;
		
		double area;
		
		area = (5 * Math.pow(side, 2)) / (4 * b) ;
		
		System.out.printf( " The area of the pentagon is " + "%.2f",area);
		

	}
}
