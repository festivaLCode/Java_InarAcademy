package Chapter04;

public class Chapter04Q25 {

	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 26 + 65);
		int number2 = (int) (Math.random() * 26 + 65);
		int number3 = (int) (Math.random() * 26 + 65);
		int number4 = (int) (Math.random() * 9000 + 1000);

		char ch1 = (char) number1;
		char ch2 = (char) number2;
		char ch3 = (char) number3;

		System.out.println("The random licence plate number is >>>" + " " + ch1 + "" + ch2 + "" + ch3 + "-" + number4);

	}

}
