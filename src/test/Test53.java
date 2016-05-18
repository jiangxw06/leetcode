package test;

import org.junit.After;
import org.junit.Test;

import main.No53;


public class Test53 {
	int[] nums={-2,1,-3,4,-1,2,1,-5,4};
	int result;
	@Test
	public void test() throws Exception{
		result=new No53().maxSubArray(nums);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
