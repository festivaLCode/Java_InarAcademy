package Chapter05;

public class Chapter05Q06 {
	public static void main(String[] args) {
		System.out.println("\tMiles\t\tKilometers\t\t    |     \tKilometers \tMiles");

		for (int miles = 1, kilometers1 = 20; miles < 11; kilometers1 += 5, miles++) {
			double kilometers = miles * 1.609;
			double miles1 = kilometers1 * 0.621371;
			String s = "|";
			System.out.printf("\t%-3d\t\t%3.3f\t\t\t%5s\t\t%-3d\t\t%3.3f\n", miles, kilometers, s, kilometers1, miles1);

		}

	}
}
