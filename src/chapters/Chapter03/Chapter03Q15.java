package Chapter03;

import java.util.Scanner;

public class Chapter03Q15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int lottery = (int) ((Math.random() * 100));

		System.out.println(" Please enter a two digit number including 1 as 01 (example 2 = 02, 3= 03 ");
		int number = keyboard.nextInt();

		int onesDigit = number % 10;
		int tensDigit = ((number - onesDigit) / 10);
		int temp = onesDigit;
		onesDigit = tensDigit;
		tensDigit = temp;

		int lotteryOnesDigit = lottery % 10;
		int lotteryTensDigit = ((lottery - lotteryOnesDigit) / 10);
		System.out.println(" Lottery Number  is  " + lottery);

		if (number == lottery) {
			System.out.println(" Congratulations you won $10000");

		}else if (lotteryOnesDigit == tensDigit && lotteryTensDigit == onesDigit) {
			System.out.println(" Two numbers matched . Congratulations you won $3000");

		}else if  (lotteryOnesDigit == tensDigit 
				|| lotteryTensDigit == onesDigit
				|| lotteryOnesDigit == onesDigit
				|| lotteryTensDigit == tensDigit) {
			System.out.println(" Only 1 number matched . Congratulations you won $1000");
		} else {
			System.out.println(" Sorry!! Try your luck for the next time!!!");
			}

		}
	}


