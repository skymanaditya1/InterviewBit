import java.util.Scanner;

class ListNode{
	public int val;
	public ListNode next;
	public ListNode(int x){val=x;next=null;}
}

public class AddTwoNumbersLists{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ListNode node1=new ListNode(4);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(6);
		node1.next=node2;node2.next=node3;
		ListNode list1=new ListNode(5);
		ListNode list2=new ListNode(9);
		ListNode list3=new ListNode(7);
		ListNode list4=new ListNode(9);
		list1.next=list2;list2.next=list3;list3.next=list4;
		display(addTwoNumbers(node1, list1));
	}

	public static void display(ListNode a){
		while(a!=null){System.out.println(a.val); a=a.next;}
	}

	public static ListNode addTwoNumbers(ListNode a, ListNode b){
		ListNode curr=null, head=null; int carry=0;
		while (a!=null && b!=null){
			ListNode temp = new ListNode((a.val+b.val+carry)%10);
			carry=(a.val+b.val+carry)/10;
			if(head==null){head=temp;curr=head;}
			else{curr.next=temp;curr=temp;}
			a=a.next;b=b.next;
		}
		ListNode nodeTemp=a!=null?a:b;
		while(nodeTemp!=null){
			ListNode temp = new ListNode((nodeTemp.val+carry)%10);
			curr.next=temp;
			curr=temp;
			carry=(nodeTemp.val + carry)/10;
			nodeTemp=nodeTemp.next;
		}
		if (carry>0){ListNode temp=new ListNode(carry); curr.next=temp;}
		return head;
	}
}