package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No47;


public class Test47 {
	int[] nums={1,1,2};
	@Before
	public void setup() {
	}

	@Test
	public void test() {
		List<List<Integer>> result = new No47().permute(nums);
		System.out.println(result);
	}
}
