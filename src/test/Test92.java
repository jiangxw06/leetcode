package test;

import org.junit.Before;
import org.junit.Test;

import main.ListNode;
import main.No92;

public class Test92 {
	ListNode head;
	int m=2,n=4;
	ListNode result;

	@Before
	public void setup() {
		head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(1);
	}

	@Test
	public void test() {
		result = new No92().reverseBetween(head, m, n);
		System.out.println(result);
	}
}
