package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No96;
import main.TreeNode;

public class Test96 {
	int n=1;
	int result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No96().numTrees(n);
		System.out.println(result);
	}
}
