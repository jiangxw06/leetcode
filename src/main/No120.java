package main;

import java.util.Arrays;
import java.util.List;

public class No120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.isEmpty())
			return 0;
		int[] sum = new int[triangle.size()+1];
		Arrays.fill(sum, 0);
		for (int i = triangle.size() - 1; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++)
				sum[j] = (sum[j] < sum[j + 1] ? sum[j] : sum[j + 1]) + triangle.get(i).get(j);
		}
		return sum[0];
	}
}
