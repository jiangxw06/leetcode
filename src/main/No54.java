package main;

import java.util.ArrayList;
import java.util.List;

public class No54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		int m = matrix.length;
		if(m==0)
			return result;
		int n = matrix[0].length;
		if(n==0)
			return result;
		int startR = 0, startC = 0;
		int j,i;
		while (m > 1 && n > 1) {
			
			for (j = startC, i = startR; j < startC + n-1; j++)
				result.add(matrix[i][j]);
			for (j = startC+n-1, i = startR; i < startR + m-1; i++)
				result.add(matrix[i][j]);
			for (j = startC+n-1, i = startR+m-1; j > startC; j--)
				result.add(matrix[i][j]);
			for (j = startC, i = startR+m-1; i > startR; i--)
				result.add(matrix[i][j]);
			startR++;
			startC++;
			m-=2;
			n-=2;
		}
		if(m==1)
			for (j = startC, i = startR; j < startC + n; j++)
				result.add(matrix[i][j]);
		else if(n==1)
			for (j = startC+n-1, i = startR; i < startR + m; i++)
				result.add(matrix[i][j]);
		return result;

	}
}
