/**
 * 
 * @author srikanth naidu
 *
 * Fibonacci Series = 0 1 1 2 3 5
 * 					  |_|\  \ \
 * 					   |  \  \ \
 * 					  0+1= 1  \ \
 * 						   1+1=2 \
 * 							  1+2=3
 * 
 */
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b=sc.nextInt();
		int Series = 0;
		while (Series<=50)
		{
			Series = a+b;
			System.out.println("Series = "+Series);
			a=b;
			b=Series;
		}

	}

}
