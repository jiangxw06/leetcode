package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No103;
import main.No105;
import main.TreeNode;

public class Test105 {
	int[] preorder={},inorder={};
	TreeNode result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No105().buildTree(preorder, inorder);
		System.out.println(result);
	}
}
