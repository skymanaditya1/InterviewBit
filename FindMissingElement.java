// Problem partially solved

import java.util.Scanner;

public class FindMissingElement{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String string = "123567";
		String string1 = "12131516";
		System.out.println(findMissing(string));
		// findMissing(string);
	}
	
	// Find the missing positive integer
	public static int findMissing(String a){
		int j = 0;
		int number = 0;
		while(j<a.length()){
			int digitLength = 1;
			StringBuilder sb = new StringBuilder();
			int count = 0;
			while(count < digitLength){
				sb.append(a.charAt(count+j));
				count++;
			}
			int num1 = Integer.parseInt(sb.toString());
			j += digitLength;
			sb.setLength(0);
			count = 0;
			while(count < digitLength){
				sb.append(a.charAt(count+j));
				count++;
			}
			j+=digitLength;
			int num2 = Integer.parseInt(sb.toString());
			// System.out.println(num1);
			// System.out.println(num2);

			if(num2-num1==1) ;
			else if (num2-num1 == 2) {
				// Check if the remaining consecutive numbers also have difference 1
				number = num1+1;
				while(j<a.length()){
					sb = new StringBuilder();
					int counter = 0;
					while(counter < digitLength){
						sb.append(j+counter);
						counter++;
					}
					int number1 = Integer.parseInt(sb.toString());
					sb.setLength(0);
					j+=digitLength;
					counter = 0;
					while(counter < digitLength){
						sb.append(j+counter);
						counter++;
					}
					int number2 = Integer.parseInt(sb.toString());
					while(number2-number1==1) j++;
				}
				if(j==a.length()) return number;
			}
			else {
				digitLength ++;
				j++;
			}
		}
		return Integer.MIN_VALUE;
	}
}