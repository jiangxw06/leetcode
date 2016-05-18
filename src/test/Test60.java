package test;

import org.junit.After;
import org.junit.Test;

import main.No60;

public class Test60 {
	int n = 8,k=8590;
	String result;

	@Test
	public void test() throws Exception {
		result = new No60().getPermutation(n, k);
 	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
