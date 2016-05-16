package test;

import org.junit.Before;
import org.junit.Test;

import main.No43;

public class Test43 {

	String num1, num2;

	@Before
	public void setup() {
		num1 = "0";
		num2 = "0";
	}

	@Test
	public void test() {
		System.out.println(new No43().multiply(num1, num2));
	}
}
