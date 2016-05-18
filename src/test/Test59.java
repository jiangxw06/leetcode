package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.No54;
import main.No59;

public class Test59 {
	int n = 3;
	int[][] result;

	@Test
	public void test() throws Exception {
		result = new No59().generateMatrix(n);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
