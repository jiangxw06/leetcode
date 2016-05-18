package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No62;
import main.No63;

public class Test63 {
	int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
	int result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result = new No63().uniquePathsWithObstacles(obstacleGrid);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
