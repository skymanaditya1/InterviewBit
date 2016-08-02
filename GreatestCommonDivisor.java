import java.util.Scanner;

public class GreatestCommonDivisor{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers : " );
		int m = in.nextInt(); int n = in.nextInt();
		int number = m > n ? gcd(m, n) : gcd(n, m);
		System.out.println("The gcd is : " + number);
	}

	public static int gcd(int m, int n){
		if (n>0) return gcd(n, m%n);
		return m;
	}
}