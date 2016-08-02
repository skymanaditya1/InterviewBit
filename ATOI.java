import java.util.Scanner;
import java.math.BigInteger;

public class ATOI{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(atoi("-993 49913"));
	}

	public static int atoi(final String a){
		// escape leading whitespaces
		int position = 0;
		boolean isPositive=true;
		StringBuilder sb = new StringBuilder();
		while(position<a.length() && a.charAt(position)==' ') position++;
		if (position==a.length()) return 0;
		if(a.charAt(position) == '-' || a.charAt(position) == '+'){
			if(a.charAt(position) == '-') isPositive = false;
			else if (a.charAt(position) == '+') isPositive = true;
			position++;
		}
		// check if the character after the whitespaces is a garbage character
		if(!Character.isDigit(a.charAt(position))) return 0;
		while(position<a.length() && Character.isDigit(a.charAt(position))){
			sb.append(a.charAt(position));
			position++;
		}
		BigInteger number = new BigInteger(sb.toString());
		if(number.compareTo(new BigInteger(Integer.toString(Integer.MAX_VALUE))) > 0)
			return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		if(!isPositive) return -1*Integer.parseInt(sb.toString());
		return Integer.parseInt(sb.toString());
	}
}