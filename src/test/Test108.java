package test;

import org.junit.Before;
import org.junit.Test;

import main.No108;
import main.TreeNode;

public class Test108 {
	int[] nums = {};
	TreeNode result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No108().sortedArrayToBST(nums);
		System.out.println(result);
	}
}
