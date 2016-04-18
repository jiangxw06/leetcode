package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.AllSubSet;


public class TestAllSubSet {
	List<List<Integer>> result;
	@Test
	public void test() throws Exception{
		int[] nums={10,1,2,7};
		result=new AllSubSet().printAllSubset(nums);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
