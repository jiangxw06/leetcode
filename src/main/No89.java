package main;

import java.util.ArrayList;
import java.util.List;

public class No89 {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		for (int i = 1; i <= Math.pow(2, n); i*=2) {
			for (int j = result.size() - 1; j >= 0; j--)
				result.add(result.get(j) + i);
		}
		return result;
	}
}
