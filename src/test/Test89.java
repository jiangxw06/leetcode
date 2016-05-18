package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No77;
import main.No89;

public class Test89 {
	int n=3;
	List<Integer> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result = new No89().grayCode(n);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
