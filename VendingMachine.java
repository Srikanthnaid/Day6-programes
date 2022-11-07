
public class VendingMachine {

	public static void main(String[] args) {

		int money = 2520;
		int denominations[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int note = 0;

		while (money > 0) {

			int count = 0;

			System.out.println("Remaining money: " + money);

			while (money >= denominations[note]) {

				money = money - denominations[note];

				count++;

			}

			System.out.println(denominations[note] + " X " + count);

			note++;

		}

	}

}
