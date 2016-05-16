package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No93;

public class Test93 {
	String s="0000";
	List<String> result;

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		result = new No93().restoreIpAddresses(s);
		System.out.println(result);
	}
}
