package Chapter02.Questions;
import java.util.Scanner;

public class Chapter02Q02 {

	public static void main(String[] args) {
		// We will compute the area and volume of the Cylinder.
		Scanner keyboard = new Scanner(System.in);
		 System.out.println(" Please enter a value for radius");
		 double radius = keyboard.nextDouble();
		 
		 System.out.println(" Please enter a value for the Height of the Cylinder");
		 
		 final double PI = 3.14;
		 double H  = keyboard.nextDouble();
		 
		 //  H = Height, height of the cylinder
		 // Area = PI  * radius^2
		 // Volume =  PI * radius^2  * Height
		 double Area = PI  * Math.pow(radius,2);
		 double Volume = PI  * Math.pow(radius,2) * H ;
		 
		 System.out.println("  The area of the cylinder when radius is  " + radius +
				 "  and height is " + H +  "\n>>>> =  "+ Area);
		 System.out.println("  The Volume of the cylinder when radius is   " + radius +
				 "  and height is 3" + H +  "\n>>>> =  "+ (Volume *100) /100 );
	}

}
