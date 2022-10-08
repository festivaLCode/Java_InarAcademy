package Chapter05;

public class Chapter05Q10 {
	public static void main(String[] args) {
		System.out.println("The numbers that are divisible by 5 and 6 \n" + "--------------------------------------- ");

		int count = 0;
		for (int i = 100; i < 1000; i++) {
			if (i % 30 == 0) {
					count++;
				if (count % 10 == 0) {
					System.out.print(i + "\n");
				} else {
					System.out.print("" + i + " ");
				}

			}

		}

	}

}
