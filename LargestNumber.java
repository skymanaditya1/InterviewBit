import java.util.Scanner;
import java.util.*;

public class LargestNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//int[] arr={3, 30, 34, 5, 9};
		int[] arr={0, 0, 0, 0, 0};
		String result=generateString(modifiedSort(arr));
		// display(modifiedSort(arr));
		System.out.println(result);
	}

	public static void display(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static String generateString(int[] arr){
		int index=0;
		while(index<arr.length && arr[index]==0) index++;
		if(index==arr.length) return "0";
		StringBuilder sb=new StringBuilder();
		for(int i=index;i<arr.length;i++) sb.append(arr[i]);
		return sb.toString();
	}

	public static int[] modifiedSort(int[] arr){
		for(int i=0; i<arr.length-1;i++){
			int position=i, temp=arr[i];
			for(int j=i+1; j<arr.length;j++){
				// perform the modified comparison operation
				if(comparison(arr[j], temp)){
					temp=arr[j]; position=j;
				}
			}
			arr[position]=arr[i]; arr[i]=temp;
		}
		return arr;
	}

	public static boolean comparison(int x, int y){
		// return true if xy > yx
		int xy=Integer.parseInt(Integer.toString(x)+Integer.toString(y));
		int yx=Integer.parseInt(Integer.toString(y)+Integer.toString(x));
		return xy>yx?true:false;
	}

	public static int[] selectionSort(int[] arr){
		for (int i=0; i<arr.length-1; i++){
			int position=i, temp=arr[i];
			for (int j=i+1; j<arr.length; j++){
				if(arr[j]<temp){
					temp=arr[j]; position=j;
				}
			}
			arr[position]=arr[i]; arr[i]=temp;
		}
		return arr;
	}
}