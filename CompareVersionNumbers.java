import java.util.Scanner;
import java.math.BigInteger;

// if version1 > version2 return 1,
// if version1 < version2 return -1
// otherwise (version1==version2) return 0

public class CompareVersionNumbers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(compareVersion("4444371174137455 ", "5.168"));
	}

	public static int compareVersion(String a, String b){
        String[] version1 = a.split("\\.");
        String[] version2 = b.split("\\.");
        int length = version1.length < version2.length ? version1.length : version2.length;
        int position = 0;
        while(position < length) {
            BigInteger b1 = new BigInteger(version1[position]);
            BigInteger b2 = new BigInteger(version2[position]);
            if (b1.compareTo(b2) > 0) return 1;
            else if (b1.compareTo(b2) < 0) return -1;
            position++;
        }
        while(position<version1.length){
            BigInteger b3 = new BigInteger(version1[position]);
            if(b3.compareTo(BigInteger.ZERO) > 0) return 1;
            position++;
        }
        while(position<version2.length){
            BigInteger b4 = new BigInteger(version2[position]);
            if(b4.compareTo(BigInteger.ZERO) > 0) return -1;
            position++;
        }
        return 0;
    }

	/**public static int compareVersion1(String a, String b){
		String[] version1 = a.split("\\.");
		String[] version2 = b.split("\\.");
		// Compare revisions
		int length = version1.length < version2.length ? version1.length : version2.length;
		int position=0;
		while(position<length){
			if(Integer.parseInt(version1[position]) > Integer.parseInt(version2[position])) return 1;
			else if (Integer.parseInt(version1[position]) < Integer.parseInt(version2[position])) return -1;
			else position++;
		}
		while(position<version1.length){
			if(Integer.parseInt(version1[position])>0) return 1;
			position++;
		}
		while(position<version2.length){
			if(Integer.parseInt(version2[position])>0) return 1;
			position++;
		}
		return 0;
	}*/
}