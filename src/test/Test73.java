package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No71;
import main.No73;

public class Test73 {
	int[][] matrix = { { 0, 0, 0, 5 }, { 4, 3, 1, 4 }, { 0, 1, 1, 4 }, { 1, 2, 1, 2 }, { 0, 0, 1, 1 } };
	String result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		new No73().setZeroes(matrix);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(matrix);
	}
}
