package main;

public class No48 {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int center = n / 2;
		for (int i = 0; i < center; i++)
			for (int j = i; j < n-1-i; j++) {
				int tmp = matrix[i][j];
				matrix[i][j]=matrix[n-1-i][i];
				matrix[n-1-i][i]=matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=tmp;
			}
	}
}
