package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No46;

public class Test46 {
	int[] nums={1,3,2};
	@Before
	public void setup() {
	}

	@Test
	public void test() {
		List<List<Integer>> result = new No46().permute(nums);
		System.out.println(result);
	}
}
