import java.util.Scanner;

public class ExcelColumnNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Number is : " + titleToNumber("AA"));
	}

	public static int titleToNumber(String a){
		int sum = 0;
		for (int i=0; i<a.length(); i++)
			sum += ((int)a.charAt(i)-64) * Math.pow(26, a.length() - i - 1);
		return sum;
	}
}