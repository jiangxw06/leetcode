package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No81;

public class Test81 {
	int[] nums = {1,3};
	int target=3;
	boolean  result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result=new No81().search(nums, target);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
		PrintResult.show(nums);
	}
}
