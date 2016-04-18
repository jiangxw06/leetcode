package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.No40;

public class Test40 {
	List<List<Integer>> result;
	@Test
	public void test() throws Exception{
		int[] nums={10,1,2,7,6,1,5,23,1,34,5,7,5,3,2,5,7,9,6,4,2,4,7,9,3,2};
		int target=15;
		result=new No40().combinationSum2(nums, target);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
