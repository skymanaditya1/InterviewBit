import java.util.Scanner;
import java.util.ArrayList;

public class NearestSmallerElement{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list.add(4);list.add(5);list.add(2);list.add(10);
		list.add(39);list.add(27);list.add(11);list.add(4);
		list.add(24);list.add(32);list.add(32);list.add(1);
		ArrayList<Integer> smaller = prevSmaller(list);
		display(smaller);
	}

	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr){
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for(int i=0; i<arr.size(); i++){
			int j = i-1;
			while(j>=0 && arr.get(j) >= arr.get(i)){
				j--;
			}
			if(j>=0 ? newArr.add(arr.get(j)) : newArr.add(-1));
		}
		return newArr;
	}

	// Print the elements of the ArrayList
	public static void display(ArrayList<Integer> arr){
		for(int i=0; i<arr.size(); i++)
			System.out.print(arr.get(i) + " ");
		System.out.println();
	}
}