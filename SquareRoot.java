import java.util.Scanner;

public class SquareRoot {
	public void toFindSquareRoot() {
		//find square root by using newtons method
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = s.nextDouble();
		double answer = num;
         while((Math.abs(answer-num/answer)) > (1e-15*answer))
         {
             answer = (answer + (num/answer))/2;
         }
         System.out.println(answer);
	}

	public static void main(String[] args) {
		SquareRoot root = new SquareRoot();
		root.toFindSquareRoot();
	}

}
