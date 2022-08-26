import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the starting time:");
		long Start_time = sc.nextLong();
		System.out.println("Please enter the End time:");
		long End_time = sc.nextLong();
		long Elapsed_Time = 0;
		Elapsed_Time = Start_time - End_time;
		System.out.println("Elasped_time :" +Elapsed_Time);
	}
}