package Chapter05;

public class Chapter05Q07 {
	public static void main(String[] args) {
		double tuition = 10_000;
		double tuition1 = 10_000;

		double total = 0;
		double total1 = 0;
		
		for (int years = 1; years <= 10; years++) {
			tuition *= 1.05;
			total+=tuition;

		}
		for (int collegeYears = 1; collegeYears <= 14; collegeYears++) {

			tuition1 *= 1.05;

			total1 += tuition1;
		}
		System.out.println("-----------------------------------------");
		System.out.printf("Afer 10 years" + " Tuition will be  $%3.3f \n", tuition);
		System.out.printf("Afer 14 years" + " Tuition will be  $%3.3f \n", tuition1);
		System.out.printf("The total cost of the college after 10th year is " + "%3.3f", (total1 - total));

	}

}
