package Chapter05;

public class Chapter05Q15 {
	public static void main(String[] args) {
		System.out.println(" The characters in the ASCII character table from ! to ~. ");
		System.out.println("-----------------------------------------------------------");

		int counter = 0;
		for (char ch = 33; ch <= 126; ch++) {
			counter++;
			if (counter % 10 == 0) {
				System.out.print(ch + "\n");
			} else {
				System.out.print("" + ch + " ");
			}
			
	
		}

	}

}
