package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.No63;
import main.No71;

public class Test71 {
	String path="/home/";
	String result;

	@Before
	public void setup() {
	}

	@Test
	public void test() throws Exception {
		result = new No71().simplifyPath(path);
	}

	@After
	public void after() throws Exception {
		PrintResult.show(result);
	}
}
