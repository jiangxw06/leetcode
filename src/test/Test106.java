package test;

import org.junit.Before;
import org.junit.Test;

import main.No106;
import main.TreeNode;

public class Test106 {
	int[] postorder = {}, inorder = {};
	TreeNode result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No106().buildTree(inorder, postorder);
		System.out.println(result);
	}
}
