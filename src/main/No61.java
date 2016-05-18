package main;

public class No61 {

	public ListNode rotateRight(ListNode head, int k) {
		ListNode p = head;
		int l = 0;
		while (p != null) {
			p = p.next;
			l++;
		}
		if (l == 0)
			return null;
		int r = k % l;
		if (r == 0)
			return head;
		p = head;
		while (r > 0 && p != null) {
			p = p.next;
			r--;
		}
		ListNode newTail = head;
		ListNode newHead;
		while (p.next != null) {
			newTail = newTail.next;
			p=p.next;
		}
		newHead = newTail.next;
		p.next = head;
		newTail.next = null;
		return newHead;
	}

}
