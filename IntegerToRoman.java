import java.util.Scanner;
import java.util.*;

public class IntegerToRoman{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("The equivalent Integer is : " + romanToInt("XX"));
	}

	public static int romanToInt(String a){
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int num=0;

		for(int i=0; i<a.length(); i++){
			if((i+1)<a.length() && (map.get(Character.toString(a.charAt(i))) < map.get(Character.toString(a.charAt(i+1)))))
				num=num-map.get(a.charAt(i));
			else
				num=num+map.get(Character.toString(a.charAt(i)));
		}
		return num;
	}
}