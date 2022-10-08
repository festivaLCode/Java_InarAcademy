package Chapter05;

public class Chapter05Q11 {
	public static void main(String[] args) {
		System.out.println("The numbers that are divisible by 5 or 6 but not both \n"
				+ "----------------------------------------------------- ");

		int count = 0;
		for (int number = 100; number < 201; number++) {
			if (number % 6 == 0 ^ number % 5 == 0) {
				count++;
				if (count % 10 == 0) {
					System.out.print(number + "\n");
				} else {
					System.out.print("" + number + " ");
				}
			}
		}

	}

}
