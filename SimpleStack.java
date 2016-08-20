import java.util.Scanner;

class Stack{
	int val;
	int top;
	public Stack(){top = -1;}
	public int getVal(){return val;}
	public int getTop(){return top;}
	public void setVal(int val){this.val = val;}
}

class StackFunctions{
	ArrayList<Integer> list = new ArrayList<Integer>();
	public void push(int val){
		list.add(val);
		top++;
	}
	public int pop(){
		return list.get(top);
	}
	public int getTop(){
		return top;
	}
}

public class SimpleStack{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	}
}