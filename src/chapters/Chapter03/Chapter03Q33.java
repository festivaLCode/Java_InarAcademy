package Chapter03;

import java.util.Scanner;

public class Chapter03Q33 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter the weight and price for package 1");

		double weight1 = keyboard.nextDouble();
		double price1 = keyboard.nextDouble();
		System.out.println(" Enter the weight and price for package  2");

		double weight2 = keyboard.nextDouble();
		double price2 = keyboard.nextDouble();

		double unitPrice1 = (price1 / weight1);
		double unitPrice2 = (price2 / weight2);

		if (unitPrice1 < unitPrice2) {
			System.out.println(" Package 1 has a better unit price!!!  Unit Price: " + unitPrice1);
		} else if ( unitPrice1 == unitPrice2){
			System.out.println( " The packages have the same price!!! ");
		}else
			System.out.println(" Package 2 has a better unit  price!!! Unit Price: " + unitPrice2);
		System.exit(1);

	}

}
