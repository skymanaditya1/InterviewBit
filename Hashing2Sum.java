import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Hashing2Sum{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2); list.add(7); list.add(11); list.add(15);
		int target = 9;
		display(twoSum(list, target));
	}

	public static void display(ArrayList<Integer> list){
		for(int a : list)
			System.out.print(a + " ");
		System.out.println();
	}

	public static ArrayList<Integer> twoSum(final List<Integer> a, int b){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=0; i<a.size()-1; i++){
			for(int j=i+1; j<a.size(); j++){
				if (a.get(i) + a.get(j) == b){
					numbers.add(i+1); numbers.add(j+1);
				}
			}
		}
		return numbers;
	}
}