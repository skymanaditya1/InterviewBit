import java.util.Scanner;
import java.math.BigInteger;

public class PowerOf2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println(power("147573952589676412928"));
	}

	public static int power(String a){
		BigInteger b = new BigInteger(a);
		// System.out.println(b.toString());
		if(b.compareTo(BigInteger.ONE) == 0) return 0;
		// System.out.println("Comparison with 1 : " + b.compareTo(BigInteger.ONE));
		while(b.compareTo(BigInteger.ONE)!=0 && 
			b.remainder(new BigInteger("2"))==BigInteger.ZERO) {
			b = b.divide(new BigInteger("2"));
			//System.out.println(b.toString());
		}
		if(b.compareTo(BigInteger.ONE)==0) return 1;
		return 0;
	}

	public static int power1(String a){
		if(Integer.parseInt(a) == 1) return 1;
		while(Integer.parseInt(a)!=1 && Integer.parseInt(a)%2==0)
			a=Integer.toString(Integer.parseInt(a)/2);
		if(Integer.parseInt(a)==1) return 1;
		return 0;
	}
}