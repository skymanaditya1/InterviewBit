import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3); list.add(4);list.add(1);list.add(4);//list.add(1);
		System.out.println(repeatedNumber(list));
	}

	public static int repeatedNumber(final List<Integer> a){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0; i<a.size(); i++){
			if(map.containsKey(a.get(i))) map.put(a.get(i), map.get(a.get(i))+1);
			else map.put(a.get(i), 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()>1) return entry.getKey();
		}
		return -1;
	}
}