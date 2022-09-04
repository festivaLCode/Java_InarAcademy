package Chapter01.Questions;
/*(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
2 * 2 system of linear equation:
ax + by = e
cx + dy = f
Write a program that solves the following equation and displays the value for x and y:
3.4x + 50.2y = 44.5
2.1x + .55y = 5.9
 */

public class Chapter01Q13 {
	// We will define the variables and constants
	// And we will solve the problem
	public static void main(String[] args) {
		System.out.println("3.4x + 50.2y  =  44.5 ");
		System.out.println("2.1x + 0.55y  =  5.9  ");
		System.out.println("Please solve for  X  and  Y.");
		// a= 3.4 b= 50.2 c= 2.1 d= 0.55 e= 44.5 f=5.9
		System.out.println("Solution for X = ((44.5 * 0.55)-(50.2  * 5.9))  / ((3.4  *0.55) - (50.2  *  2.1))");
		System.out.println("X  >>>>>  =  " + ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));

		System.out.println("Solution for Y = ((3.4 * 5.9) - (44.5  *  2.1))  / ((3.4  *0.55) - (50.2  *  2.1))");
		System.out.println("X  >>>>>  =  " + ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));

	}
}
