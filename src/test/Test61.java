package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.ListNode;
import main.No61;


public class Test61 {
	int k=4;
	ListNode head;
	ListNode result;
	@Before
	public void setup(){
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
	}

	@Test
	public void test() throws Exception {
		result = new No61().rotateRight(head,k);
 	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
