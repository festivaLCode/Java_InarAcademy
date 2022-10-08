package Chapter05;

public class Chapter05Q03 {
	public static void main(String[] args) {
		System.out.println("\tKilograms\t\tPounds");

		for (int kilos = 1; kilos < 200; kilos+=2) {
			double pounds = kilos * 2.2;

			System.out.printf("\t" + kilos + "\t\t\t%3.1f\n", pounds);

		}

	}

}
