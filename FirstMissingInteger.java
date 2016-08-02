import java.util.Scanner;
import java.util.ArrayList;

public class FirstMissingInteger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		// a.add(-3); a.add(0); a.add(-1); a.add(1); a.add(8);
		// a.add(1); a.add(2); a.add(0);
		// a.add(3); a.add(4); a.add(-1); a.add(1);
		// a.add(-8); a.add(-7); a.add(-6);
		a.add(8); a.add(5); a.add(10);
		System.out.println(firstMissingPositive(a));
	}

	public static void sortList(ArrayList<Integer> a){
		for(int i=0; i<a.size()-1; i++){
			int temp=a.get(i), position=i;
			for(int j=i+1; j<a.size(); j++){
				if(a.get(j)<temp){
					temp=a.get(j);
					position=j;
				}
			}
			a.set(position, a.get(i));
			a.set(i, temp);
		}
	}

	public static void display(ArrayList<Integer> a){
		for(int i=0; i<a.size(); i++) System.out.print(a.get(i) + " ");
		System.out.println();
	}

	public static int firstMissingPositive(ArrayList<Integer> a){
		sortList(a);
		int startIndex=0;
		while(startIndex<a.size() && a.get(startIndex) <= 0) startIndex++;
		if(startIndex==a.size() || a.get(startIndex)!=1) return 1;
		// return the next positive integer
		while(startIndex<a.size()-1 && a.get(startIndex+1) - a.get(startIndex)==1)
			startIndex++;
		return a.get(startIndex)+1;
	}
}