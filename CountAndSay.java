import java.util.Scanner;

public class CountAndSay{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(countAndSay(2));
	}

	public static String countAndSay(int a){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("1");
		if(a==1) return stringBuilder.toString();
		int number=1; // marks the nth sequence
		while(number<a){
			String currentString = stringBuilder.toString();
			stringBuilder.setLength(0);
			int position=0;
			while(position<currentString.length()){
				char currentChar=currentString.charAt(position);
				int num=1; // counts the number of occurrences
				while((num+position)<currentString.length() && 
					currentString.charAt(num+position) == currentChar)
					num++;
				stringBuilder.append(Integer.toString(num)); stringBuilder.append(currentChar);
				position=position+num;
			}
			number++;
		}
		return stringBuilder.toString();
	}
}