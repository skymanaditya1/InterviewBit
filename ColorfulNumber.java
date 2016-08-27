import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColorfulNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(colorful(12));
	}

	public static void display(ArrayList<String> list){
		for(String l : list)
			System.out.print(l + " ");
		System.out.println();
	}

	public static int colorful(int a){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int digit_length=1; digit_length<=Integer.toString(a).length(); digit_length++){
			int j = 0;
			while(j+digit_length<=Integer.toString(a).length()){
				StringBuilder sb = new StringBuilder();
				for(int i=j; i<j+digit_length; i++)
					sb.append(Integer.toString(a).charAt(i));
				int product = calculateProduct(sb.toString());
				if(set.contains(product)) return 0;
				set.add(product);
				j++;
			}
		}
		return 1;
	}

	public static void displayInteger(ArrayList<Integer> list){
		for(int a : list)
			System.out.print(a);
		System.out.println();
	}

	public static int colorful1(int a){
		// ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int digit_length=1; digit_length<=Integer.toString(a).length(); digit_length++){
			int j = 0;
			while(j+digit_length<=Integer.toString(a).length()){
				StringBuilder sb = new StringBuilder();
				for(int i=j; i<j+digit_length; i++)
					sb.append(Integer.toString(a).charAt(i));
				int product = calculateProduct(sb.toString());
				if(map.containsKey(product))
					return 0;
				map.put(product, Integer.parseInt(sb.toString()));
				j++;
			}
		}
		// display(list);
		return 1;
	}

	public static int calculateProduct(String a){
		int product = 1;
		for(int i=0; i<a.length(); i++)
			product *= Integer.parseInt(Character.toString(a.charAt(i)));
		return product;
	}
}