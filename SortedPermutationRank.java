import java.util.Scanner;

public class SortedPermutationRank{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : " );
		String pal = in.nextLine();
		System.out.println("The rank is : " + findRank(pal));
	}

	public static int findRank(String a){
		int rank = 0, tempNumber = 0;
		for (int i=0; i<a.length(); i++) {
			rank += (fact(a.length()- i - 1))%1000003 * (findSmallerInRight(i, a))%1000003;
		}
		return (rank+1)%1000003;
	}

	public static int findSmallerInRight(int low, String a){
		int countRight = 0;
		for (int i=low+1; i<a.length(); i++)
			if (a.charAt(i) < a.charAt(low)) countRight++;
		return countRight;
	}

	public static int fact(int n){
		if (n == 1 || n == 0) return 1;
		else return n * fact(n-1) % 1000003;
	}
}