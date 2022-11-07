import java.util.Scanner;

public class MonthlyPayment {
	public void toFindMonthliyPayment() {
		System.out.println("Wlcome to MonthlyPayment:");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter principal amount:");
		double p = s.nextDouble();

		// take year;
		System.out.print("Enter year:");
		double y = s.nextDouble();

		// take interest;
		System.out.print("Enter rate of interest");
		double r = s.nextDouble();
		
		/*double r = R / (12 * 100);
        double n = 12 * Y;
        double payment = (P * r) / (1 - Math.Pow((1 + r), (-n)));*/
		
		double totalAmount = p * (Math.pow(1 + (r / 100), y));
		System.out.println("total amount = "+totalAmount);
		
		double EMI = totalAmount / (y * 12);
		System.out.println("Monthly pay"+EMI);
	}

	public static void main(String[] args) {
		MonthlyPayment payment = new MonthlyPayment();
		payment.toFindMonthliyPayment();

	}

}
