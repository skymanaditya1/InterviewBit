import java.util.Scanner;

class StackNode{
	StackNode next;
	Character val;

	public StackNode(){
		next = null;
		val = '\0';
	}

	public StackNode(Character val){
		this.val = val;
		next = null;
	}
}

class Stack{
	StackNode top;
	public Stack(){
		top = null;
	}
	public void push(Character c){
		StackNode tempNode = new StackNode(c);
		if(top == null){
			top = tempNode;
		}
		else{
			tempNode.next = top;
			top = tempNode;
		}
	}

	public Character pop(){
		Character c = top.val;
		top = top.next;
		return c;
	}

	public Character peek(){
		return top.val;
	}

	public boolean isEmpty(){
		if(top == null) return true;
		return false;
	}
}

public class RedundantBraces{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = "((a+b))";
		// String a = "{a+(b+c})";
		System.out.println(braces(a));
	}

	public static int braces(String a){
		int i = 0;
		Stack stack = new Stack();
		while(i<a.length()){
			// push if an opening brace
			if (a.charAt(i) == '{' || a.charAt(i) == '[' || a.charAt(i) == '(')
				stack.push(a.charAt(i));
			// push if an operator
			if (a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '/' || a.charAt(i) == '*')
				stack.push(a.charAt(i));
			// closing brace -> go to the neareast opening brace
			// check if there is atleast one operator in between
			else if (a.charAt(i) == '}'){
				int operator_count = 0;
				while(!stack.isEmpty() && stack.peek() != '{'){
					if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/')
						operator_count ++;
					stack.pop();		
				}
				if(!stack.isEmpty() && stack.peek() == '}') stack.pop();
				if(!stack.isEmpty() && operator_count == 0) return 1;
			}
			else if (a.charAt(i) == ']'){
				int operator_count = 0;
				while(!stack.isEmpty() &&  stack.peek() != '['){
					if(stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '/' || stack.peek() == '*')
						operator_count ++;
					stack.pop();
				}
				if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
				if(!stack.isEmpty() && operator_count == 0) return 1;
			}

			else if (a.charAt(i) == ')'){
				int operator_count = 0;
				while (!stack.isEmpty() && stack.peek() != '('){
					if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/')
						operator_count ++;
					stack.pop();
				}
				// System.out.println("Stack status : " + stack.isEmpty());
				if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
				if (!stack.isEmpty() && operator_count == 0) return 1;
			}
			i++;
		}
		if(stack.isEmpty()) return 0;
		return 1;
	}
}