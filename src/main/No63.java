package main;

import java.util.Arrays;

public class No63 {
	public int uniquePathsWithObstacles(int[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		int m = grid.length;
		int n = grid[0].length;
		int[] memo = new int[n];
		Arrays.fill(memo, 0);
		memo[0] = grid[0][0] == 0 ? 1 : 0;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1)
					memo[j] = 0;
				else if(j>0)
					memo[j] = memo[j] + memo[j - 1];
			}
		return memo[n-1];

	}
}
