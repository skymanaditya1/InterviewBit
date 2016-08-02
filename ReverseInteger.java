import java.util.Scanner;

public class ReverseInteger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(reverse(-1234567891));
	}

	public static int reverse(int a){
		int numberLength = 0;
		boolean isNegative = a < 0 ? true : false;
		int number = Math.abs(a);
		while (number>0){
			numberLength ++;
			number /= 10;
		}
		int reversedNumber = 0;
		number = Math.abs(a);
		while (number > 0){
			reversedNumber += (number % 10) * Math.pow(10, --numberLength);
			if (reversedNumber >= Integer.MAX_VALUE) return 0;
			number /= 10;
		}
		if (isNegative) return -1 * reversedNumber;
		return reversedNumber;
	}
}