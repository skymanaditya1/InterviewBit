import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	ListNode(int x){val=x;next=null;}
}

public class RotateList{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next=node2;node2.next=node3;node3.next=node4;node4.next=node5;
		display(rotateRight(node1, 2));
	}
	public static ListNode rotateRight(ListNode a, int b){
		ListNode temp = a, last = a, newHead = null;
		int position = 0, length=0;
		while (temp!=null){temp=temp.next;length++;}
		if (length==b%length) return a;
		temp=a;
		b%=listLength;
		while (temp!=null && position<(length-b-1)){temp=temp.next; position++;}
		newHead=temp.next;
		while (last.next!=null) last=last.next;
		temp.next=null;
		last.next=a;
		return newHead;
	}
	public static void display(ListNode a){
		while(a!=null){System.out.println(a.val);a=a.next;}
	}
}