package Chapter02.Questions;

import java.util.Scanner;
public class Chapter02Q13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please enter the monthly saving amount : ");
		 double monthlySaving = keyboard.nextDouble();
		 
		 final double interest;
		 
		 interest = (0.05 / 12) ;
		 
		 double constant;
		 constant =  1 + interest;
		 
		 
		 double theAccountValue1 = monthlySaving * (constant);
		 double theAccountValue2 = (monthlySaving + theAccountValue1) * (constant);
		 double theAccountValue3 = (monthlySaving + theAccountValue2) * (constant);
		 double theAccountValue4 = (monthlySaving + theAccountValue3) * (constant);
		 double theAccountValue5 = (monthlySaving + theAccountValue4) * (constant);
		 double theAccountValue6 = (monthlySaving + theAccountValue5) * (constant);
		 
		 System.out.printf(" After the sixth month, the account value is " + "%.2f", theAccountValue6 );

		 
	}

}
