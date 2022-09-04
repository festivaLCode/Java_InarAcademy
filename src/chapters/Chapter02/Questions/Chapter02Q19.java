package Chapter02.Questions;

import java.util.Scanner;

public class Chapter02Q19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter the coordinates of the triangle");
		// Declare all the coordinates of desired triangle

		double x1 = keyboard.nextDouble();
		double y1 = keyboard.nextDouble();
		double x2 = keyboard.nextDouble();
		double y2 = keyboard.nextDouble();
		double x3 = keyboard.nextDouble();
		double y3 = keyboard.nextDouble();
		// Calculate the sides by using Pythagorean Theorem

		double side1 = Math.pow(( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) ), 0.5);
		double side2 = Math.pow(( (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1) ), 0.5);
		double side3 = Math.pow(( (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) ), 0.5);

		// Lets find out s which is equal to =>> s = (side1 + side2 + side3) /2
		double s = (side1 + side2 + side3) / 2;
		double Area = Math.pow(s *(s - side1) * (s - side2) * (s - side3), 0.5);

		System.out.printf(" The area of the triangle with the given coordinates is  : " + "%.3f",Area);

	}

}
