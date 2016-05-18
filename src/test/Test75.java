package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No74;
import main.No75;

public class Test75 {
	int[] nums={0};

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		new No75().sortColors(nums);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(nums);
	}
}
