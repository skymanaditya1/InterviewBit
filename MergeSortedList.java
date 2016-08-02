import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x; next = null;}
}

public class MergeSortedList{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1 = new ListNode(5); ListNode node2 = new ListNode(8);
		ListNode node3 = new ListNode(20);
		ListNode head1 = new ListNode(4); ListNode head2 = new ListNode(11);
		ListNode head3 = new ListNode(15);
		node1.next=node2; node2.next=node3;
		head1.next=head2;head2.next=head3;
		ListNode head = mergeTwoLists(node1, head1);
		display(head);
	}

	public static void display(ListNode a){
		while (a!=null){
			System.out.println(a.val);
			a=a.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode a, ListNode b){
		ListNode head=null, curr=null;
		while(a!=null&&b!=null){
			ListNode temp=new ListNode(a.val<=b.val?a.val:b.val);
			if(head==null){head=temp;curr=head;}
			else{curr.next=temp;curr=curr.next;}
			if(a.val<=b.val)a=a.next; else b=b.next;
		}	
		curr.next=a!=null?a:b;
		return head;
	}

	public static ListNode mergeTwoLists1(ListNode a, ListNode b){
		ListNode head = null, curr = null;
		while (a!=null && b!=null){
			if (a.val <= b.val){
				ListNode temp = new ListNode(a.val);
				if (head == null) {
					head = temp; curr = head;
				} else {
					curr.next = temp;
					curr = curr.next;
				}
				a = a.next;
			} else {
				ListNode temp = new ListNode(b.val);
				if (head == null) {
					head = temp; curr = head;
				} else {
					curr.next = temp;
					curr = curr.next;
				}
				b=b.next;
			}
		}
		ListNode tempNode = a!=null ? a : b;
		curr.next=tempNode;
		return head;
	}
}