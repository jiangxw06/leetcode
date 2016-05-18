package main;

public class No82 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)return null;
		ListNode hh = new ListNode(0);
		boolean isDup = false;
		ListNode tt = hh;
		ListNode current = head;
		while (head.next != null) {
			if (head.val == head.next.val)
				isDup = true;
			else {
				if(!isDup)
				{
					tt.next=head;
					tt=head;
				}
				isDup = false;
			}
			head=head.next;
		}
		if (!isDup)
			tt.next = head;
		else
			tt.next = null;
		return hh.next;
	}
}
