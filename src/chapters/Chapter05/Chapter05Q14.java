package Chapter05;

import java.util.Scanner;

public class Chapter05Q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// We will find GCD of two integers.

		System.out.println(" Please enter the first integer :");
		int n1 = input.nextInt();

		System.out.println(" Please enter the first integer :");
		int n2 = input.nextInt();
		int d = Math.min(n1, n2);
		System.out.println(d + "  is min number");
		
		System.out.println("--------------------");
		while (n1 % d != 0 || n2 % d != 0 ) {
			d--;

		}
		System.out.println(d + "  is GCD ");

	}

}
