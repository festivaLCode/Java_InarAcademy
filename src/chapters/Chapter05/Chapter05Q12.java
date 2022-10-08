package Chapter05;

public class Chapter05Q12 {
	public static void main(String[] args) {

		int n = 0;
		while ((n * n) < 12000) {
			n--;

			if (n * n < 12000) {
			}

		}
		System.out.println("The smallest integer n such that n^2 is greater than 12,000  is\n " + "(" + n + ")");
		System.out.println(" Satisfaction -------------------");
		System.out.println(n + " * " + n + " = " + (n * n) + " > 12000 ");

	}

}
