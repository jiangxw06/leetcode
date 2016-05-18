package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No73;
import main.No74;

public class Test74 {
	int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
	int target = 51;
	boolean result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result = new No74().searchMatrix(matrix, target);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
