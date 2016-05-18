package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No77;
import main.No79;

public class Test79 {
	char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
	String[] words = {"ABCCED","SEE","ABCB"};
	List<Boolean> results;

	@Before
	public void setup() {
		results = new ArrayList<Boolean>();
	}

	@Test
	public void test() throws Exception {
		for(String word:words)
		results.add(new No79().exist(board, word));
	}

	@After
	public void after() throws Exception {
		PrintResult.show(results);
	}
}
