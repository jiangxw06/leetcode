package main;

public class No86 {
	public ListNode partition(ListNode head, int x) {
		if (head == null)
			return null;
		ListNode less = new ListNode(0), ltail = less;
		ListNode bigger = new ListNode(0), btail = bigger;
		while (head != null) {
			if (head.val < x) {
				ltail.next = head;
				ltail=head;
			}
			else{
				btail.next = head;
				btail=head;
			}
			head = head.next;
		}
		ltail.next=bigger.next;
		btail.next=null;
		return less.next;
	}
}
