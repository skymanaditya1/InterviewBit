import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x;next=null;}
}

public class ReverseLinkListII{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1=new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next=node2;node2.next=node3;node3.next=node4;node4.next=node5;
		display(reverseBetween(node1, 2, 4));
	}

	public static void display(ListNode a){
		while(a!=null){System.out.println(a.val); a=a.next;}
	}

	public static ListNode reverseBetween(ListNode a, int m, int n){
		ListNode temp1 = a; int i = 1;
		while (i<(m-1)) {temp1=temp1.next; i++;}
		ListNode prev=temp1, curr=temp1.next, next;
		i=0;
		while(curr!=null && i<(n-m+1)){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			i++;
		}
		temp1.next.next=curr;
		temp1.next=prev;
		return a;
	}
}