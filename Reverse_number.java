import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = s.nextInt();
		int reverse = 0;
		while(num>0)
		{
			 reverse = reverse*10+num%10;
			 num = num/ 10;
		}
		System.out.println( "Reverse number of= " +reverse);
	}

}
