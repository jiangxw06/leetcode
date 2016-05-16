package test;

import org.junit.Before;
import org.junit.Test;

import main.No64;
import main.No69;

public class Test69 {
	int x=2147395599;
	int result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No69().mySqrt(x);
		System.out.println(result);
	}
}
