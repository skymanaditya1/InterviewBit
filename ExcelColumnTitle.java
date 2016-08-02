import java.util.Scanner;

public class ExcelColumnTitle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(convertToString(943566));
	}

	public static String convertToString(int a){
		String result = "";
		if (a <= 26) result += Character.toString((char)(a+64));
		else{
			if (a%26 == 0) { result += convertToString((a/26-1)) + Character.toString((char)90);}
			else result += convertToString(a/26) + Character.toString((char)(a%26 + 64));
		}
		// else result += convertToString(a/26) + a%26==0 ? Character.toString((char)(90)) : Character.toString((char)(a%26+64));
		return result;
	}
}