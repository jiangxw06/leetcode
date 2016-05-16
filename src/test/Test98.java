package test;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.No98;
import main.TreeNode;

public class Test98 {
	TreeNode root;
	boolean result;

	@Before
	public void setup() {
//		root=new TreeNode(1);
//		root.right=new TreeNode(3);
//		root.right.left=new TreeNode(2);
	}

	@Test
	public void test() {
		result = new No98().isValidBST(root);
		Assert.assertThat(result, CoreMatchers.equalTo(true));
//		System.out.println(result)
	}
}
