package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.No39;

public class Test39 {
	List<List<Integer>> result;
	@Test
	public void test(){
		int[] nums={7,6,3,2};
		int target=7;
		result=new No39().combinationSum(nums, target);
	}
	@After
	public void after() throws Exception{
//		System.out.println("resuts:");
//		for(List<Integer> list:result)
//		{
//			for(int i:list)
//				System.out.print(i+",");
//			System.out.println();
//		}
		PrintResult.show(result);
	}
}
