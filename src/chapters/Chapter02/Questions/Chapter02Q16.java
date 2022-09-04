package Chapter02.Questions;
import java.util.Scanner;
public class Chapter02Q16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please enter a value for side length of the hexagon  : ");
		 double side = keyboard.nextDouble();
		 
		 double Area;
		 Area = (3 * (Math.pow(3, 0.5)) / 2) * ( Math.pow(side, 2) );
		 
		 System.out.printf("The Area of the Hexagon when the given side  is  " + side + "  is  " + " %.3f", Area );
		 
		 
	}

}
