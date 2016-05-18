package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No120;
import main.TreeNode;

public class Test120 {
	int result;
	List<List<Integer>> triangle = null;

	@Before
	public void setup() {
		triangle=new ArrayList<List<Integer>>();
		triangle.add(new ArrayList<Integer>());
	}

	@Test
	public void test() {
		result = new No120().minimumTotal(triangle);
		System.out.println(result);
	}
}
