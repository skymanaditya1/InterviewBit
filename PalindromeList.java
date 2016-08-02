import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	ListNode(int x) {val = x; next = null;}
}

public class PalindromeList{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1 = new ListNode(6);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(7);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(6);
		node1.next = node2; node2.next = node3; node3.next = node4;
		node4.next = node5;
		System.out.println(lPalin(node1));
	}

	public static int lPalin(ListNode A){
		ListNode temp = A;
		int listLength = 0;
		while (temp!=null) {listLength++;temp=temp.next;}
		int i = 0; ListNode curr = A, prev=null, next;
		while (i < (listLength+1)/2) {i++;curr=curr.next;}
		while (curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		temp = A;
		while (prev != null) {if (prev.val != temp.val) return 0; prev=prev.next;temp=temp.next;}
		return 1;
	}
}