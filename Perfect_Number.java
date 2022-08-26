/**
 * @author srikanth naidu
 *     6
 *   6 divisors =1,2,3
 *   sum of divisors = 1+2+3 = 6
 *   sum of divisors is equals to number that is perfect_number.
 */
import java.util.Scanner;
public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Perfect_number :");
			
		}
		else
		{
			System.out.println("not perfect_number: ");
		}
		
	}
}
