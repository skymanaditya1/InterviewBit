import java.util.Scanner;

public class PalindromeString{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome(".,"));
	}

	public static int isPalindrome(String a){
		for (int i=0, j=a.length()-1; i<j; i++, j--){
			while(i<a.length()-1 && !Character.isLetterOrDigit(a.charAt(i))) i++;
			if(i==a.length()-1) return 1;
			while(j>0 && !Character.isLetterOrDigit(a.charAt(j))) j--;
			if(Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(j))) return 0;
		}
		return 1;
	}
}