import java.util.Random;

public class Copuon_Number {

	public static void main(String[] args) {
		int max = 100000;
		char[] chars="abcdefghijkl!~@#$%^&*@~%mnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int random=(int) (Math.random()*max);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<=5;i++)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);
		}

}
