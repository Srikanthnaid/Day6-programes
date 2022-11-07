import java.util.Scanner;

public class temperaturConversion {
	public void toConertTEmperature() {
		Scanner s = new Scanner(System.in);
		//take temperatures from user.
		System.out.print("Enter temperature: ");
		int temp = s.nextInt();
		
		
		//select option to convert temperature.
		System.out.print("Enter  1: Celsius to Fahrenheit"
								+ "\n\t 2: Fahrenheit to Celsius\n");
		int option = s.nextInt();
		
		switch (option)
        {
		case 1:
			int F =(temp * 9/5) + 32 ;
			System.out.println("fahrenheit"+F);
			break;
		case 2:
			int C =(temp -32)*5/9 ;
			System.out.println("Celsius: "+C);
			break;
		default:
			System.out.println("Select correct options:");
        }
	}

	public static void main(String[] args) {
		temperaturConversion conversion = new temperaturConversion();
		conversion.toConertTEmperature();

	}

}
