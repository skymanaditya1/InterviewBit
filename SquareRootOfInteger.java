import java.util.Scanner;

public class SquareRootOfInteger{
	public static int divisor=0;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = in.nextInt();
		// System.out.println(Math.sqrt(Integer.MAX_VALUE));
		// divisor=generatePrime((int)Math.sqrt(Integer.MAX_VALUE));
		System.out.println("The square root is : " + sqrt(num));
	}

	public static int sqrt(int a){
		long low=1, high=a/2;
		while(low<=high){
			long mid=(low+high)/2;
			if(mid*mid==a) return (int)mid;
			else if (mid*mid>a) high=mid-1;
			else {
				if((mid+1)*(mid+1) > a) return (int)mid;
				low=mid+1;
			}
		}
		return -1;
	}

	/**public static int sqrt(int a){
		int low=1, high=a/2;
		while(low<=high){
			int mid=(low+high)/2;
			if(((mid%divisor)*(mid%divisor))==a%divisor) return mid;
			else if (((mid%divisor)*(mid%divisor)) >=(a%divisor)) high=mid-1;
			else{
				if((((mid+1)%divisor)*((mid+1)%divisor)) > a%divisor) 
					return mid;
				low=mid+1;
			}
		}
		return -1;
	}

	public static int generatePrime(int n){
		// Generate the greatest prime smaller than n
		int primeNumber=0;
		for (int i=n;i>=2;i--)
			if(checkPrime(i)==1) return i;
		return -1;
	}

	public static int checkPrime(int n){
		for (int i=2; i<=Math.sqrt(n); i++)
			if (n%i==0) return 0;
		return 1;
	}*/

	/**public static int sqrt(int a){
		int i=1;
		while(i*i<a){
			i=i+1;
		}
		return (i-1);
	}*/
}