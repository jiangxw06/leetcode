package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No95;
import main.TreeNode;

public class Test95 {
	int n=3;
	List<TreeNode> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No95().generateTrees(n);
		System.out.println(result);
	}
}
