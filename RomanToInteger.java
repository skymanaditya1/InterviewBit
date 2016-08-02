import java.util.Scanner;
import java.util.*;

public class RomanToInteger{
	final static Map<Integer, String> map=new HashMap<Integer, String>();
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		map.put(1, "I"); 
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		System.out.println(romanToInt(90));
	}

	public static String romanToInt(int number){
		int num;
		StringBuilder sb=new StringBuilder();
		int power=Integer.toString(number).length()-1;
		if(map.containsKey(number)) return map.get(number);
		while(number>0){
			int q=(int)(number/Math.pow(10, power));
			if(map.containsKey(q)) {
				num=(int)(q*Math.pow(10, power));
				sb.append(map.get(num));
			}
			else if(q>=2 && q<=3) {
				num=(int)(Math.pow(10, power));
				for(int i=0; i<q; i++) sb.append(map.get(num));
			}
			else if (q==4){
				num=(int)(1*Math.pow(10, power));
				sb.append(map.get(num));
				num=(int)(5*Math.pow(10, power));
				sb.append(map.get(num));
			}
			else if (q>=6 && q<=8){
				num=(int)(5*Math.pow(10, power));
				sb.append(map.get(num));
				num=(int)(1*Math.pow(10, power));
				for(int i=0;i<q-5; i++)
					sb.append(map.get(num));
			}
			else if (q==9) {
				num=(int)(1*Math.pow(10, power));
				sb.append(map.get(num));
				num=(int)(10*Math.pow(10, power));
				sb.append(map.get(num));
			}
			number=number-(int)(q*Math.pow(10, power)); power--;
		}
		return sb.toString();
	}
}