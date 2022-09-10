package Chapter03;

import java.util.Scanner;

public class Chapter03Q08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( " Please enter 3 integers");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		if ( a < b  &&  a < c  &&  b < c ) { // c is the greatest, b is the middle and  a is the least 
			System.out.println(" The increasing order is  " +  a + "   " + b + "   " + c );
		
		}else if  ( a < b  &&  a < c  &&  c < b ) { // b is the greatest, c is the middle and a is the least
			System.out.println(" The increasing order is  " +  a + "   " + c + "  " + b );
		
		}else if  ( b < a  &&  b < c  &&  a < c )  {// c is the greatest, a is the middle and b is the least
			System.out.println(" The increasing order is  " +  b + "   " + a + "  " + c );
		
		}else if  ( b < a  &&  b < c  &&  c < a ) { // a is the greatest, c is the middle and b is the least
			System.out.println(" The increasing order is  " +  b + "   " + c + "  " + a );
		
		}else if  ( c < a  &&  c < b  &&  b < a ) {  // a is the greatest, b is the middle and c is the least
			System.out.println(" The increasing order is  " +  c + "   " + b + "  " + a );
		
		}else if  ( c < a  &&  c < b  &&  a < b )  // b is the greatest, a is the middle and c is the least
			System.out.println(" The increasing order is  " +  c + "   " + a + "  " + b );
		System.exit(1);
		
		
	}
}

	


