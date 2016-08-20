import java.util.Scanner;

class StackNode{
	Character val;
	StackNode next;

	public StackNode(){
		val = '\0';
		next = null;
	}

	public StackNode(Character val){
		this.val = val;
		next = null;
	}

	public void setVal(Character val){
		this.val = val;
	}

	public Character getVal(){
		return val;
	}

	public void setNext(StackNode next){
		this.next = next;
	}

	public StackNode getNext(){
		return next;
	}
}

class Stack{
	StackNode top;

	public Stack(){
		top = null;
	}

	public void push(Character ch){
		StackNode tempNode = new StackNode(ch);
		if(top == null) top = tempNode;
		else{
			tempNode.setNext(top);
			top = tempNode;
		}
	}

	public Character pop(){
		Character ch = top.getVal();
		top = top.getNext();
		return ch;
	}

	public boolean isEmpty(){
		if (top == null) return true;
		return false;
	}

	public Character peek(){
		return top.getVal();
	}
}

public class GenerateAllParentheses{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s ="{}()[]";
		System.out.println(isValid(s));
	}

	public static int isValid(String paren){
		int i = 0;
		Stack stack = new Stack();
		while(i<paren.length()){
			if(paren.charAt(i) == '{')
				stack.push(paren.charAt(i));
			else if (paren.charAt(i) == '[')
				stack.push(paren.charAt(i));
			else if (paren.charAt(i) == '(')
				stack.push(paren.charAt(i));
			else if (paren.charAt(i) == '}'){
				if(stack.isEmpty() || stack.peek()!='{')
					return 0;
				else 
					stack.pop();
			}
			else if (paren.charAt(i) == ']'){
				if(stack.isEmpty() || stack.peek()!='[')
					return 0;
				else
					stack.pop();
			}
			else if (paren.charAt(i) == ')'){
				if(stack.isEmpty() || stack.peek()!='(')
					return 0;
				else 
					stack.pop();
			}
			i++;
		}
		if(stack.isEmpty()) return 1;
		return 0;
	}
}