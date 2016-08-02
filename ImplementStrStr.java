import java.util.Scanner;

public class ImplementStrStr{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String haystack="The sky is blue";
		String needle="sky";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(final String haystack, final String needle){
		if(haystack.length()==0 || needle.length()==0) return -1;
		int hayIndex=0;
		while(hayIndex<haystack.length()-needle.length()+1){
			int needleIndex=0;
			while(needleIndex<needle.length() && 
				haystack.charAt(hayIndex+needleIndex)==needle.charAt(needleIndex))
				needleIndex++;
			if(needleIndex==needle.length()) return hayIndex;
			hayIndex++;
		}
		return -1;
	}
}