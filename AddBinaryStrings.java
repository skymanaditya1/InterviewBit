import java.util.Scanner;

public class AddBinaryStrings{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(addBinary("11100", "111"));
	}

	public static String addBinary(String a, String b){
		int length=a.length()<b.length() ? a.length() : b.length();
		// System.out.println(length);
		StringBuilder sb=new StringBuilder();
		int i=0, num=0;
		while(i<length){
			num+=Character.getNumericValue(a.charAt(a.length()-i-1))+
				Character.getNumericValue(b.charAt(b.length()-1-i));
			sb.append(Integer.toString(num%2));
			num=num/2;
			i++;
		}
		if(i<a.length()){
			while(i<a.length()){
				num+=Character.getNumericValue(a.charAt(a.length()-i-1));
				sb.append(Integer.toString(num%2));
				num/=2;
				i++;
			}
		}
		else{
			while(i<b.length()){
				num+=Character.getNumericValue(b.charAt(b.length()-1-i));
				sb.append(Integer.toString(num%2));
				num/=2;
				i++;
			}
		}
		if(num>0) sb.append(num);
		return sb.reverse().toString();
	}
}