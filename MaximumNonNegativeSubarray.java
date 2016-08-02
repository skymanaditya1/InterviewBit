import java.util.Scanner;
import java.util.ArrayList;

public class MaximumNonNegativeSubarray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1); list.add(2);list.add(5);list.add(-7);list.add(2);list.add(3);
		System.out.println(maxSum(list));
	}

	public static int maxSum(ArrayList<Integer> a){
		int sum=0; int max=Integer.MIN_VALUE;
		for(int i=0; i<a.size(); i++){
			if(sum+a.get(i)>0) sum+=a.get(i);
			else sum=0;
			if(sum>max) max=sum;
		}
		return max;
	}

	public static ArrayList<Integer> maxSet(ArrayList<Integer> a){
		
	}

	/**public static ArrayList<Integer> maxset(ArrayList<Integer> a){

	}*/
}