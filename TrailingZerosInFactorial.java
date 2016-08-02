import java.util.Scanner;

public class TrailingZerosInFactorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : " ) ;
		int n = in.nextInt();
		System.out.println("The number of trailing zeros are : " + trailingZeros(n));
	}

	public static int trailingZeros(int n){
		int numberZeros = 0;
		for (int i=5; i<=n; i*=5)
			numberZeros += n/i;
		return numberZeros;
	}
}