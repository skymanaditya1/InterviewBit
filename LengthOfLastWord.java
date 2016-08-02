import java.util.Scanner;

public class LengthOfLastWord{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(lengthOfLastWord("Word1    "));
	}

	public static int lengthOfLastWord(final String s){
		int wordLength=0;
		// Skip trailing white spaces and other characters
		int i=s.length()-1;
		while(i>=0 && !Character.isLetterOrDigit(s.charAt(i))) i--;
		if(i<0) return 0;
		for(int j=i; j>=0; j--){
			if(!Character.isLetterOrDigit(s.charAt(j))) return wordLength;
			wordLength++;
		}
		return wordLength;
	}
}