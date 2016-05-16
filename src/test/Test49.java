package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.No48;
import main.No49;

public class Test49 {
	String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
	@Before
	public void setup() {
	}

	@Test
	public void test() {
		List<List<String>> result = new No49().groupAnagrams(strs);
		System.out.println(result);
	}
}
