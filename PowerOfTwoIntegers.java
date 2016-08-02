import java.util.Scanner;

public class PowerOfTwoIntegers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int number = in.nextInt();
		if(isPower(number)) System.out.println("True");
		else System.out.println("False");
	}

	public static boolean isPower(int a){
		if (a == 1) return true;
		for (int i=2; i<=a; i++){
			int j = 2;
			while ((int)Math.pow(i, j) <= a){
				if ((int)Math.pow(i, j) == a) return true;
				j++;
			}
		}
		return false;
	}
}