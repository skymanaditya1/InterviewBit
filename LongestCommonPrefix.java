import java.util.Scanner;
import java.util.ArrayList;

public class LongestCommonPrefix{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		list.add("abcdefgh");
		list.add("aefghijk");
		list.add("abcefgh");
		System.out.println(longestCommonPrefix(list));
	}

	public static String longestCommonPrefix(ArrayList<String> a){
		// Find the length of the shortest string
		StringBuilder stringBuilder = new StringBuilder();
		int shortestLength = findShortestLength(a);
		int position=0; // boolean exit = true;
		while(position < shortestLength){
			char currentChar = a.get(0).charAt(position);
			for (int i=1; i<a.size(); i++)
				if (a.get(i).charAt(position) != currentChar) return stringBuilder.toString(); 
			stringBuilder.append(currentChar);
			position++;			
		}
		return stringBuilder.toString();
	}

	public static int findShortestLength(ArrayList<String> a){
		int shortestLength = Integer.MAX_VALUE;
		for (int i=0; i<a.size(); i++) if (a.get(i).length() < shortestLength) 
			shortestLength=a.get(i).length();
		return shortestLength;
	}
}