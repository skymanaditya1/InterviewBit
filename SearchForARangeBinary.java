import java.util.Scanner;
import java.util.*;

public class SearchForARangeBinary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final List<Integer> a = new ArrayList<Integer>();
		//a.add(5);a.add(7);a.add(7);a.add(8);a.add(8);a.add(10);
		a.add(1);
		display(searchRange(a, 1));
	}

	public static void display(ArrayList<Integer> list){
		for(int i=0;i<list.size(); i++) System.out.print(list.get(i) + " " );
		System.out.println();
	}

	public static ArrayList<Integer> searchRange(final List<Integer> a, int b){
		int low=lowerRange(a, b-1);
		int high=higherRange(a, b+1);
		ArrayList<Integer> list=new ArrayList<Integer>();
		if((low+1)>(high-1)) {list.add(-1); list.add(1);}
		else {list.add(low+1); list.add(high-1);}
		return list;
		// System.out.println(low);
		// System.out.println(high);
	}

	public static int lowerRange(final List<Integer> a, int b){
		int low=0, high=a.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a.get(mid)==b) return mid;
			else if(a.get(mid) < b) low=mid+1;
			else {if(mid-1<0 || a.get(mid-1)<b) return mid-1; high=mid-1;}
		}
		return -1;
	}

	public static int higherRange(final List<Integer> a, int b){
		int low=0, high=a.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a.get(mid)==b) return mid;
			else if(a.get(mid)>b) high=mid-1;
			else{if(mid+1>a.size()-1 || a.get(mid+1)>b) return mid+1; low=mid+1;}
		}
		return -1;
	}
}