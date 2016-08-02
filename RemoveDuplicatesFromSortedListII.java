import java.util.Scanner;

class ListNode{
	public int val; 
	public ListNode next;
	public ListNode(int x){val = x; next = null;}
}

public class RemoveDuplicatesFromSortedListII{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		/*ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(5);
		l1.next=l2; l2.next=l3; l3.next=l4; l4.next=l5; l5.next=l6; l6.next=l7;	*/
		l1.next=l2; l2.next=l3;
		display(deleteDuplicates(l1));
	}
	
	public static void display(ListNode a){
		while (a!=null) {System.out.println(a.val); a=a.next;}
	}

	public static ListNode deleteDuplicates(ListNode a){
		ListNode curr = a;
		while (curr!=null && curr.next!=null){
			boolean isDuplicate = false;
			ListNode temp = curr.next, next = temp.next;
			while (next != null && temp.val == next.val) 
				{next = next.next; isDuplicate = true;}
			if(isDuplicate && curr == a) {a = next; curr = a;}
			else if (isDuplicate && curr!=a) curr.next = next;
			else curr=curr.next;
		}
		return a;
	}
}