import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearch{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = {2, 6, 13, 21, 36, 47, 63, 81, 97};
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);list.add(6);list.add(13);list.add(21);list.add(36);
		list.add(47);list.add(63);list.add(81);list.add(97);
		// System.out.println("Element found at position : " + bSearch(list, list.size(), 13));
		System.out.println("Element found at position : " + bSearch(list, list.size(), 13));
	}

	public static int bSearch(int[] a, int n, int k){
		int low=0, high=n-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a[mid]==k) return mid;
			else if(a[mid]>k) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}

	public static int bSearch(ArrayList<Integer> list, int n, int k){
		int low=0, high=n-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(k==list.get(mid)) return mid;
			else if (k>list.get(mid)) low=mid+1;
			else high=mid-1;
		}
		return -1;
	}
}