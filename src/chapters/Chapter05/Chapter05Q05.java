package Chapter05;

public class Chapter05Q05 {
	public static void main(String[] args) {
		System.out.println("\tKilograms\tPounds\t\t    |     \tPounds \t\tKilograms");

		for (int kilos = 1, pounds1 = 20; kilos < 200; pounds1 += 5, kilos += 2) {
			double pounds = kilos * 2.2;
			double kilos1 = pounds1 * 0.454;
			String s = "|";
			System.out.printf("\t%-3d\t\t%3.1f\t\t%5s\t\t%-3d\t\t%3.2f\n", kilos, pounds, s, pounds1, kilos1);

		}

	}
}
