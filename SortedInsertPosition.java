import java.util.Scanner;
import java.util.ArrayList;

public class SortedInsertPosition{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(3);list.add(5);list.add(6);
		System.out.println(searchInsert(list, 0));
	}

	public static int searchInsert(ArrayList<Integer> a, int b){
		int low=0, high=a.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a.get(mid)==b) return mid;
			else if(a.get(mid)>b) high=mid-1;
			else{if(mid==a.size()-1 || a.get(mid+1)>b) return (mid+1); low=mid+1;}
		}
		return 0;
	}
}