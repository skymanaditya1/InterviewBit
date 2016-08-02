import java.util.Scanner;

public class PalindromeInteger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = in.nextInt();
		if (isPalindrome(number)) System.out.println("Is a palindrome");
		else System.out.println("Is not a palindrome");
	}

	public static boolean isPalindrome(int a){
		if (a<0) return false;
		String number = Integer.toString(a);
		for (int i=0; i<number.length()/2; i++)
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) return false;
		return true;	
	}
}