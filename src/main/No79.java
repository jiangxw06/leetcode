package main;

import java.util.Arrays;

public class No79 {
	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0)
			return false;
		boolean[][] flags = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++)
			Arrays.fill(flags[i], true);
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (board[i][j] == word.charAt(0)) {
					flags[i][j] = false;
					if (helper(board, flags, word, 0, i, j))
						return true;
					flags[i][j] = true;
				}
		return false;
	}

	private boolean helper(char[][] board, boolean[][] flags, String word, int index, int i, int j) {
		if (index >= word.length()-1)
			return true;
		index++;
		if (j + 1 < board[0].length && flags[i][j + 1] && word.charAt(index) == board[i][j+ 1]) {
			flags[i][j + 1] = false;
			if (helper(board, flags, word, index, i, j + 1))
				return true;
			flags[i][j + 1] = true;
		}
		if (j - 1 >= 0 && flags[i][j - 1] && word.charAt(index) == board[i][j-1]) {
			flags[i][j-1]=false;
			if(helper(board, flags, word, index, i, j - 1))
				return true;
			flags[i][j-1]=true;
		}
		if (i - 1 >= 0 && flags[i - 1][j] && word.charAt(index) == board[i-1][j]) {
			flags[i-1][j]=false;
			if(helper(board, flags, word, index, i-1, j))
				return true;
			flags[i-1][j]=true;
		}
		if (i + 1 < board.length && flags[i + 1][j] && word.charAt(index) == board[i+1][j]) {
			flags[i+1][j]=false;
			if(helper(board, flags, word, index, i + 1, j))
				return true;
			flags[i+1][j]=true;
		}
		return false;
	}
}
