package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.No54;
import main.No55;

public class Test55 {
	int[] nums = { 2, 3, 1, 0, 4 };
	boolean result;

	@Test
	public void test() throws Exception {
		result = new No55().canJump(nums);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
