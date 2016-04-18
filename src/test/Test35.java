package test;

import org.junit.After;
import org.junit.Test;

import main.No35;

public class Test35 {
	int result;
	@Test
	public void test(){
		int[] nums={5, 7,  9, 10};
		int target=8;
		result=new No35().searchInsert(nums, target);
	}
	@Test
	public void test2(){
		int[] nums={1};
		int target=2;
		result=new No35().searchInsert(nums, target);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
