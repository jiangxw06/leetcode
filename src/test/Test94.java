package test;

import java.util.List;


import org.junit.Before;
import org.junit.Test;

import main.No94;
import main.TreeNode;

public class Test94 {
	TreeNode root;
	List<Integer> result;

	@Before
	public void setup() {
		root=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(3);
	}

	@Test
	public void test() {
		result = new No94().inorderTraversal(root);
		System.out.println(result);
	}
}
