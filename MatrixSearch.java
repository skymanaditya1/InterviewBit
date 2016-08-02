import java.util.Scanner;
import java.util.ArrayList;

public class MatrixSearch{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);list1.add(3);list1.add(5);list1.add(7);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);list2.add(11);list2.add(16);list2.add(20);
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(23);list3.add(30);list3.add(34);list3.add(50);
		list.add(list1);list.add(list2);list.add(list3);
		// example of retrieving an element (list.get(0)).get(0)
		System.out.println("Enter the element to find : ");
		int element=in.nextInt();
		//System.out.println(bSearch((ArrayList<Integer>)list.get(matrixSearch(list, element)), element));
		System.out.println(matrixSearch(list, element));	
	}

	public static int matrixSearch(ArrayList<ArrayList<Integer>> a, int b){
		int low=0, high=a.size()-1;
		int no_rows=a.size(), no_cols=(a.get(0)).size();
		while(low<=high){
			int mid=(low+high)/2;
			if ((a.get(mid/no_cols)).get(mid%no_cols) == b) return 1;
			else if((a.get(mid/no_cols)).get(mid%no_cols) < b) low=mid+1;
			else high=mid-1;
		}
		return 0;
	}

	// Returns the array list with the element
	public static int matrixSearch1(ArrayList<ArrayList<Integer>> a, int b){
		int low=0, high=a.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if((a.get(mid)).get(0) == b) return mid;
			else if((a.get(mid)).get(0) > b) high=mid-1;
			else{if((a.get(mid+1)).get(0) > b) return mid; low=mid+1;}
		}
		return -1;
	}

	// Returns the position in the given array list
	public static int bSearch(ArrayList<Integer> a, int b){
		int low=0, high=a.size()-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a.get(mid)==b) return mid;
			else if(a.get(mid)>b) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}
}