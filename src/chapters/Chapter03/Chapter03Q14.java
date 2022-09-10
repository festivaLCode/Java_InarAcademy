package Chapter03;

import java.util.Scanner;

public class Chapter03Q14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please enter your guess :>>>> HEADS for (0) / TAILS for (1) ??");
		
		int guess = keyboard.nextInt();
		if (guess < 0 || guess >=2 ) {
			System.out.println(" Wrong INPUT, Please enter 0 or 1");
			System.exit(1);
		}
		
		
		int randomNumber;
		randomNumber = (int)(Math.random()* 2);
		if (randomNumber == 1) {
			System.out.println("Random Flip is = TAILS");
		}else if (  randomNumber == 0)	{
			System.out.println( "Random Flip = HEADS");
			
		}
		
		if ( randomNumber == guess) {
			System.out.println( guess + " = " + randomNumber +  " Congrats, Your guess is CORRECT !!!");
		}else
			System.out.println( guess + " not equal to " + randomNumber +  " Sorry!! Your Guess is WRONG :(( ");
 
	}

}
