import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Diffkli{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(5); list.add(3);
		System.out.println(diffPossible(list, 2));
	}

	public static int diffPossible(final List<Integer> a, int b){
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		boolean repeatedElements = false;
		for (int i=0; i<a.size(); i++){
			if (hashMap.containsKey(a.get(i)))
				repeatedElements = true;
			else{
				hashMap.put(a.get(i), i);
			}
		}
		if (repeatedElements && b == 0) return 1;
		for (int i=0; i<a.size(); i++){
			if (hashMap.containsKey(a.get(i)-b))
				if (hashMap.get(a.get(i)-b)!=i)
					return 1;
		}
		return 0;
	}
}