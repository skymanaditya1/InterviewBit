import java.util.Scanner;
import java.util.ArrayList;

public class WaveArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		// list.add(1);list.add(2);list.add(3);list.add(4);
		list.add(2);list.add(4);list.add(1);list.add(3);
		display(wave(selectionSort(list)));

	}

	public static void display(ArrayList<Integer> a){
		for(int i=0;i<a.size();i++) System.out.print(a.get(i) + " ");
		System.out.println();
	}

	public static ArrayList<Integer> wave(ArrayList<Integer> a){
		boolean val=true;
		if(a.size()==1) return a;
		for(int i=0;i<a.size()-1;i++){
			if(val) {
				if (a.get(i)<a.get(i+1)) {
					// swap the two numbers
					int temp=a.get(i);
					a.set(i, a.get(i+1));
					a.set(i+1, temp);
				}
			}
			else{
				if (a.get(i)>a.get(i+1)){
					// swap the two numbers
					int temp=a.get(i);
					a.set(i, a.get(i+1));
					a.set(i+1, temp);
				}
			}
			val=!val;
		}
		return a;
	}

	public static void swap(int a, int b){
		int temp=a; a=b;b=temp;
	}

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> a){
		for (int i=0;i<a.size()-1;i++){
			int temp=a.get(i); int position=i;
			for(int j=i+1;j<a.size();j++){
				if(a.get(j)<temp) {
					temp=a.get(j); position=j;
				}
			}
			a.set(position, a.get(i));
			a.set(i, temp);
		}
		return a;
	}
}