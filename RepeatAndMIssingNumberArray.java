import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RepeatAndMIssingNumberArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(6);list.add(5);list.add(6);
		display(repeatedNumber(list));
	}

	public static void display(ArrayList<Integer> list){
		for (int i=0; i<list.size(); i++) System.out.print(list.get(i) + " ");
		System.out.println();
	}

	public static ArrayList<Integer> repeatedNumber(final List<Integer> a){
		ArrayList<Integer> result=new ArrayList<Integer>();
		long sumActual=(long)a.size()*(long)(a.size()+1)/2;
		long sumList=0, sumSquaredList=0;
		for(int i=0; i<a.size(); i++) {
			sumList+=(long)a.get(i);
			sumSquaredList+=(long)a.get(i)*(long)a.get(i);
		}
		// if sumActual > sumList : A (twice) < B (missing)
		// if sumActual < sumList : A (twice) > B (missing)
		// sumActual - sumList = B (missing) - A (twice)
		long difference=sumActual-sumList;
		long sumSquaredActual=(long)a.size()*(long)(a.size()+1)*(long)(2*a.size()+1)/6;
		long differenceSquared=sumSquaredActual-sumSquaredList;
		long A=((long)(differenceSquared/difference+(long)difference))/2;
		long B=A-difference;
		result.add((int)B); result.add((int)A);
		return result;
	}
}