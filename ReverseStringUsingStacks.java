import java.util.Scanner;
import java.util.ArrayList;

class Stack{
	int top = -1;
	ArrayList<String> list = new ArrayList<String>();
	
	public void push(String element){
		list.add(element);
		top++;
	}

	public String pop(){
		return list.get(top--);
	}

	public boolean isEmpty(){
		if(top == -1) return true;
		return false;
	}
}

public class ReverseStringUsingStacks{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String reverse = "abc";
		Stack stack = new Stack();
		int i = 0;
		while(i<reverse.length()) stack.push(Character.toString(reverse.charAt(i++)));
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) sb.append(stack.pop());
		System.out.println(sb.toString());
	}
}