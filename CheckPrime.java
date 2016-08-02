import java.util.*;
public class CheckPrime{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = in.nextInt();
		ArrayList<Integer> primes = primesum(number);
		for (int i=0; i<primes.size(); i++) 
			System.out.println(primes.get(i));
	}

	public static ArrayList<Integer> primesum(int a){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i=2; i<=a/2; i++)
			if (checkPrime(i) && checkPrime(a-i)){
				primes.add(i); primes.add(a-i);
				return primes;
			}
		return null;
	}

	public static ArrayList<Integer> primesum2(int a){
		// Generate the prime numbers from 2 to the number itself
		ArrayList<Integer> allPrimes = addPrimes(a);
		System.out.println("Generated all the prime numbers");
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i=0; i<allPrimes.size(); i++){
			if (checkPrime(a - allPrimes.get(i))){
				primes.add(allPrimes.get(i));
				primes.add(a-allPrimes.get(i));
				return primes;
			}
		}
		return null;
	}

	public static ArrayList<Integer> primesum1(int a){
		// Generate prime numbers from 2 to the number itself
		ArrayList<Integer> allPrimes = addPrimes(a);
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i=0; i<allPrimes.size(); i++)
			for (int j=i; j<allPrimes.size(); j++)
				if (allPrimes.get(i) + allPrimes.get(j) == a){
					primes.add(allPrimes.get(i));
					primes.add(allPrimes.get(j));
					return primes;
				}
		return null;
	}

	// Method to add the prime numbers in an array list
	public static ArrayList<Integer> addPrimes(int number){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i=2; i<=number; i++){
			int count = 0;
			for (int j=2; j<=Math.sqrt(i); j++)
				if (i%j == 0) count++;
			if (count == 0) primes.add(i);
		}
		return primes;
	}

	public static boolean checkPrime(int number){
		if (number == 1) return false;
		for (int i=2; i<=Math.sqrt(number); i++)
			if (number % i == 0) return false;
		return true;
	}
}