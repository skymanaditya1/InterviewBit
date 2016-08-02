import java.util.Scanner;

public class InsertionSort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = {5, 1, 7, 6, 2};
		display(insertionSort(arr));
	}

	public static void display(int[] arr){
		for (int i=0; i<arr.length;i++) System.out.print(arr[i] + " " );
	}

	/**public static int[] insertionSort(int[] arr){
		for (int i=0; i<arr.length-1; i++){
			int j=i+1; int temp=arr[j];
			while (j>0 && temp<arr[j-1]){arr[j]=arr[j-1];j--;}
			arr[j]=temp;
		}
		return arr;
	}*/
	
}