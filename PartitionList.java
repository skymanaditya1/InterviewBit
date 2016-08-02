import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x; next=null;}
}

public class PartitionList{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		/**ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(4);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(2);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(2);
		node1.next=node2;node2.next=node3;node3.next=node4;node4.next=node5;node5.next=node6;
		*/
		ListNode node1=new ListNode(4);
		display(partition(node1, 3));
	}

	public static void display(ListNode a){
		while (a!=null) {System.out.print(a.val + " "); a=a.next;}
	}

	public static ListNode partition(ListNode a, int b){
		ListNode temp=a, newHead=null, curr=null;
		while(temp!=null){
			if(temp.val<b){
				ListNode temp1=new ListNode(temp.val);
				if (newHead==null){newHead=temp1;curr=newHead;}
				else{curr.next=temp1;curr=curr.next;}
			}
			temp=temp.next;
		}
		temp=a;
		while(temp!=null){
			if(temp.val>=b){
				ListNode temp1=new ListNode(temp.val);
				if(newHead==null){newHead=temp;curr=newHead;}
				else{curr.next=temp1;curr=curr.next;}
			}
			temp=temp.next;
		}
		return newHead;
	}
}