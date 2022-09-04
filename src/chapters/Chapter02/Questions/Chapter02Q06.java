package Chapter02.Questions;
import java.util.*;

public class Chapter02Q06 {
	public static void main(String[] args) {
		// We will calculate the sum of the digits of the numbers between 0-1000
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter a number between 0-1000");
	
		
		int number = keyboard.nextInt();
	
		int onesPlace = number % 10 ;
		int tensPlace = ((number - onesPlace) / 10) % 10;
		int hundredsPlace  = (number -  ( (tensPlace  * 10) +(onesPlace  * 1) ))  / 100 ; 
		
		System.out.println("Sum of the digits of the number you entered  which is   " +( number ));
		
		System.out.println( onesPlace + tensPlace + hundredsPlace) ;
		
		
		
		
		
	
	
	}

}
