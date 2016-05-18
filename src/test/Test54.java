package test;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import main.No53;
import main.No54;

public class Test54 {
	int[][] matrix={
	                 { 1, 2, 3,10 },
	                 { 4, 5, 6 ,11},
	                 { 7, 8, 9,12 }
	                };
	List<Integer> result;
	@Test
	public void test() throws Exception{
		result=new No54().spiralOrder(matrix);
	}
	@After
	public void after() throws Exception{
		PrintResult.show(result);
	}
}
