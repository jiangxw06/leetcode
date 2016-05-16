package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No90;

public class Test90 {
	int[] nums={1,2,2};
	List<List<Integer>> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No90().subsetsWithDup(nums);
		System.out.println(result);
	}
}
