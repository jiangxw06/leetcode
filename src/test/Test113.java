package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No106;
import main.No113;
import main.TreeNode;

public class Test113 {
	int sum;
	TreeNode root;
	List<List<Integer>> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No113().pathSum(root, sum);
		System.out.println(result);
	}
}
