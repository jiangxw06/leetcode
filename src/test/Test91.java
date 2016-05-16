package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No91;

public class Test91 {
	String s="20";
	int result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No91().numDecodings(s);
		System.out.println(result);
	}
}
