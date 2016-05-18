package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.ListNode;
import main.No81;
import main.No82;

public class Test82 {
	ListNode head;
	boolean  result;

	@Before
	public void setup() {
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
	}

	@Test
	public void test() throws Exception {
		head=new No82().deleteDuplicates(head);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
		PrintResult.show(head);
	}
}
