package test;

import org.junit.After;
import org.junit.Test;

import main.No40;
import main.No50;

public class Test50 {
	double x=2;
	int n=2147483647;
	double result;
	@Test
	public void test() throws Exception{
		result=new No50().myPow(x, n);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
