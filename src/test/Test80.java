package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No79;
import main.No80;

public class Test80 {
	int[] nums = {1,1,1,2,2,3};
	int  result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result=new No80().removeDuplicates(nums);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
		PrintResult.show(nums);
	}
}
