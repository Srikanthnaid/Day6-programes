import java.util.Scanner;

/**
 * @author srikanth naidu
 *
 *A number is divisible by 1 or itself is a prime number.
 *5 only is divisible by 1 and 5
 */
public class Prime_munber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n=s.nextInt();
		if(n%1==0  && (n*6)+1%2==0)
		{
			System.out.println("prime_number:");
		}
		else
		{
			System.out.println("not prime number:");
		}

	}

}
