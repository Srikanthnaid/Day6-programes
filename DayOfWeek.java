import java.util.Scanner;

public class DayOfWeek {
	public void findDaysOfWeek() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Year:");
		int y = s.nextInt();

		// take month.
		System.out.print("Enter month: ");
		int m = s.nextInt();

		// take day.
		System.out.print("Enter day: ");
		int d = s.nextInt();

		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;

		switch (d1) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	public static void main(String[] args) {
		DayOfWeek week = new DayOfWeek();
		week.findDaysOfWeek();

	}

}
