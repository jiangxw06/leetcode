package main;

public class No74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		return search(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1, target);
	}

	private boolean search(int[][] matrix, int startI, int startJ, int endI, int endJ, int target) {
		if (startI * matrix[0].length + startJ > endI * matrix[0].length + endJ)
			return false;
		int tmp = (startI * matrix[0].length + startJ + endI * matrix[0].length + endJ) / 2;
		int middleI = tmp / matrix[0].length;
		int middleJ = tmp % matrix[0].length;
		if (matrix[middleI][middleJ] == target)
			return true;

		if (matrix[middleI][middleJ] < target) {
			tmp++;
			middleI = tmp / matrix[0].length;
			middleJ = tmp % matrix[0].length;
			return search(matrix, middleI, middleJ, endI, endJ, target);
		}
		tmp--;
		middleI = tmp / matrix[0].length;
		middleJ = tmp % matrix[0].length;
		return search(matrix, startI, startJ, middleI, middleJ, target);

	}
}
