import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x; next=null;}
}

public class SwapListNodes{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next=node2;node2.next=node3;node3.next=node4;
		display(swapPairs(node1));
	}

	public static void display(ListNode a){
		while(a!=null){System.out.println(a.val);a=a.next;}
	}

	public static ListNode swapPairs(ListNode a){
		if (a==null || a.next==null) return a;
		ListNode curr=a, next=curr.next, prev;
		if (curr==a){
			curr.next=next.next;
			next.next=curr;
			a=next;
		}
		while (curr.next!=null && curr.next.next!=null){
			prev=curr;
			curr=curr.next;
			next=curr.next;
			curr.next=next.next;
			next.next=curr;
			prev.next=next;
		}
		return a;
	}
}