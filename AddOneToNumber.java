import java.util.Scanner;
import java.util.ArrayList;

public class AddOneToNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		//list.add(1);list.add(2);list.add(3);
		// list.add(9);list.add(9);list.add(9);
		list.add(0);list.add(0);list.add(4);list.add(4);list.add(6);
		list.add(0);list.add(9);list.add(6);list.add(5);list.add(1);
		display(plusOne(list));
	}

	public static void display(ArrayList<Integer> a){
		for(int i=0; i<a.size(); i++) System.out.print(a.get(i) + " ");
		System.out.println();
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a){
		int carry=1, i=a.size()-1;
		while(i>=0 && carry>0){
			carry=(a.get(i)+1)/10;
			a.set(i, (a.get(i)+1)%10);
			i--;
		}
		/**if (carry>0){
			// right shift the list by 1, add 1 to the 0th index
			i=a.size();
			a.add(a.size(), 0);
			while(i>0){
				a.set(i, a.get(i-1));
				i--;
			}
			a.set(i, 1);
		}*/

		if (carry>0){
			a.add(a.size(), 0);
			a.set(0, 1);
		}
		i=0; boolean trailingZeros=false;
		if(a.get(0)==0) trailingZeros=true;
		while(a.get(i)==0) i++;
		//System.out.println(i);
		int j=0;
		while(trailingZeros && j<a.size()-i){
			a.set(j, a.get(i+j));
			j++;
		}
		display(a);
		while(trailingZeros && j<a.size()) {a.remove(j);}
		return a;
	}
}