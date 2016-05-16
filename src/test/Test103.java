package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No103;
import main.No95;
import main.TreeNode;

public class Test103 {
	TreeNode root;
	List<List<Integer>> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No103().zigzagLevelOrder(root);
		System.out.println(result);
	}
}
