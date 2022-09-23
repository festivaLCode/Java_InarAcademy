package Chapter04;

import java.util.Scanner;

public class Chapter04Q24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Please enter the first city :");
		String city1 = input.nextLine();
		System.out.print(" Please enter the second city :");
		String city2 = input.nextLine();
		System.out.print(" Please enter the third city :");
		String city3 = input.nextLine();

		if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0
				&& city2.compareToIgnoreCase(city3) < 0) {
			System.out.println("The cities in alphabetical order are >>>" + city1 + " >>>" + city2 + "  >>>" + city3);

		} else if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0
				&& city3.compareToIgnoreCase(city2) < 0) {
			System.out.println("The cities in alphabetical order are >>>" + city1 + "  >>>" + city3 + "  >>>" + city2);

		} else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0
				&& city1.compareToIgnoreCase(city3) < 0) {
			System.out.println("The cities in alphabetical order are " + city2 + "  >>>" + city1 + "  >>>" + city3);

		} else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0
				&& city3.compareToIgnoreCase(city1) < 0) {
			System.out.println("The cities in alphabetical order are " + city2 + "  >>>" + city3 + "  >>>" + city1);

		} else if (city3.compareToIgnoreCase(city2) < 0 && city3.compareToIgnoreCase(city1) < 0
				&& city1.compareToIgnoreCase(city2) < 0) {
			System.out.println("The cities in alphabetical order are " + city3 + "  >>>" + city1 + "  >>>" + city2);

		} else if (city3.compareToIgnoreCase(city2) < 0 && city3.compareToIgnoreCase(city1) < 0
				&& city2.compareToIgnoreCase(city1) < 0) {
			System.out.println("The cities in alphabetical order are >>>>" + city3 + "  >>>" + city2 + "  >>>" + city1);
		} else {
			System.err.println(" ERROR !!! ");
		}

	}

}
