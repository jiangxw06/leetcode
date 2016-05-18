package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No75;
import main.No77;

public class Test77 {
	int n=4,k=2;
	List<List<Integer>> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result = new No77().combine(n, k);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
