import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x; next = null;}
}

public class RemoveDuplicatesFromSortedList{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next=node2;node2.next=node3;node3.next=node4;node4.next=node5;
		display(removeDuplicates(node1));
	}

	public static void display(ListNode a){
		while (a!=null){
			System.out.println(a.val);
			a=a.next;
		}
	}

	public static ListNode removeDuplicates(ListNode a){
		ListNode temp = a;
		while (temp!=null){
			ListNode next = temp.next;
			while (next!=null && temp.val == next.val) next=next.next;
			temp.next=next;
			temp=temp.next;
		}
		return a;
	}
}