package test;

import org.junit.Before;
import org.junit.Test;

import main.No108;
import main.No130;
import main.TreeNode;

public class Test130 {
	char[][]board={{'X','X','X','X'},{'X','O', 'O', 'X'},{'X', 'X', 'O', 'X'},{'X', 'O', 'X', 'X'}};
	char[][] result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		new No130().solve(board);
		PrintResult.show(board);
	}
}
