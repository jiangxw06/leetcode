package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No49;
import main.No64;

public class Test64 {
	int[][] grid = { 
			{ 1, 3, 2 }, 
			{ 1, 3, 2 },
			{ 1, 3, 2 }};
	int result;
	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No64().minPathSum(grid);
		System.out.println(result);
	}
}
