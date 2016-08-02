import java.util.Scanner;

public class ImplementPowerFunction{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(pow(71045970, 41535484, 64735492));
		// System.out.println(pow(5, 9, 17));
	}

	public static int pow(int base, int exponent, int modulus){
		long i=0; long result=1;
		if(modulus==1) return 0;
		while(base<0) base+=modulus;
		while(exponent>0){
			double pow=Math.pow(2, i)*(exponent%2);
			result=result*((long)Math.pow(base, pow)%modulus);
			result%=modulus;
			exponent>>=1;
			i++;
		}
		return (int) (result%modulus);
	}

	public static int pow2(int base, int exponent, int modulus){
		long result=1;
		base=base%modulus;
		while(exponent>0){
			if(exponent%2==1) result=(result*base)%modulus;
			exponent>>=1;
			base=(base%modulus)*(base%modulus);
		}
		return (int)result;
	}

	public static int pow1(int x, int n, int d){
		while(x<0) x+=d;
		if (d==1) return 0;
		long product=1;
		for(long i=0;i<n;i++) {product=product*(x%d); product%=d;}
		return (int)product;
	}
}