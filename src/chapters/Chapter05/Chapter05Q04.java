package Chapter05;

public class Chapter05Q04 {
	public static void main(String[] args) {
		System.out.println("\tMiles\t\t\tKilometers");

		for (int miles = 1; miles < 11; miles++) {
			double kilometers = miles * 1.609;

			System.out.printf("\t" + miles + "\t\t\t%3.3f\n", kilometers);

		}
	}

}
