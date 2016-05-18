package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.ListNode;
import main.No82;
import main.No86;

public class Test86 {
	ListNode head;
	int x=3;
//	boolean  result;

	@Before
	public void setup() {
		head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
	}

	@Test
	public void test() throws Exception {
		head=new No86().partition(head, x);
	}

	@After
	public void after() throws Exception {
//		PrintResult.show(result);
		PrintResult.show(head);
	}
}
