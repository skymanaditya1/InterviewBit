import java.util.Scanner;

public class ReverseTheString{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String testString="  the sky  is  blue  ";
		System.out.println("The length of the original string is : " + testString.length());
		String newString=reverseWords(testString);
		System.out.println("New String : " + newString + ", length is : " + newString.length());
	}

	public static String reverseWords(String a){
		StringBuilder sb=new StringBuilder();
		int last=a.length()-1;
		while(last>=0){
			// escape trailing whitespaces
			while(last>=0 && a.charAt(last) == ' ') last--;
			int first=last;
			//position first at the start of the word
			while(first>=0 && Character.isLetterOrDigit(a.charAt(first))) first--;
			for(int i=first+1; i<=last; i++) sb.append(a.charAt(i));
			last=first;
			if(last>=0) sb.append(a.charAt(last));
		}
		return sb.toString().trim(); // removes trailing and leading whitespaces
	}

	/**public static String reverseWords(String a){
		int i=a.length()-1;
		StringBuilder sb=new StringBuilder();
		while(i>=0){
			// trailing zeros
			while(a.charAt(i)==' ') i--;
			while(i>=0 && Character.isLetterOrDigit(a.charAt(i))) {
				sb.append(a.charAt(i));
				i--;
			}
			// check one or more white spaces
			boolean whiteSpace = false;
			if(i>=0 && a.charAt(i) == ' ') {
				whiteSpace=true;
				i--;
			}
			while(i>=0 && a.charAt(i) == ' ') i--;
			if(whiteSpace && i!=0) sb.append(' ');
		}
		return sb.toString();
	}*/
}