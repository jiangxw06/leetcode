package main;

public class No92 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode superHead=new ListNode(0);
		superHead.next=head;
		ListNode current=superHead,superTail,tmp;
		for(int i=1;i<m;i++)
			current=current.next;
		superTail=current;
		current=current.next;
		for(int i=m;i<n;i++){
			tmp=current.next;
			current.next=tmp.next;
			tmp.next=superTail.next;
			superTail.next=tmp;
		}
		return superHead.next;

	}
}
