package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.ListNode;
import main.No61;
import main.No62;

public class Test62 {
	int m=3,n=2;
	int result;
	@Before
	public void setup(){
	}

	@Test
	public void test() throws Exception {
		result = new No62().uniquePaths(m, n);
 	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
