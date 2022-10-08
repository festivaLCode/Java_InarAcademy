package Chapter05;

public class Chapter05Q13 {
	public static void main(String[] args) {

		int n = 0;
		while (n * n * n < 12000) {
			n++;

			if (n * n * n < 12000) {

			}

		}
		System.out.println("The largest integer n such that n^3 is less than 12,000  is\n " + "(" + (n - 1) + ")");
		System.out.println(" Satisfaction -------------------");
		System.out.println("(" + (n - 1) + ")" + " * " + "(" + (n - 1) + ")" + " * " + "(" + (n - 1) + ")" + " = "
				+ ((n - 1) * (n - 1) * (n - 1)) + " < 12000 ");
		System.out.println("(" + (n) + ")" + " * " + "(" + (n) + ")" + " * " + "(" + (n) + ")" + " = "
				+ ((n) * (n) * (n)) + " > 12000 ");

	}

}
