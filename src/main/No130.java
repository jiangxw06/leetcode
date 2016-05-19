package main;

public class No130 {
	/*
	 * 本解法错误，比如一个O是靠近下方的，但是和上侧边缘的某个O相通，在本解法中就不会被标记为alive
	 */
	public void solve(char[][] board) {
		if(board==null||board.length==0||board[0].length==0)
			return;
		boolean[][] alive=new boolean[board.length][board[0].length];
		int width=(board.length<board[0].length?board.length:board[0].length)/2;
		for(int depth=0;depth<=width;depth++){
			for(int j=depth;j<board[0].length-1-depth;j++)
				if(board[depth][j]=='O')
					mark(alive,depth,j);
			for(int i=depth;i<board.length-1-depth;i++)
				if(board[i][board[0].length-1-depth]=='O')
					mark(alive,i,board[0].length-1-depth);
			for(int j=depth+1;j<=board[0].length-1-depth;j++)
				if(board[board.length-1-depth][j]=='O')
					mark(alive,board.length-1-depth,j);
			for(int i=depth+1;i<=board.length-1-depth;i++)
				if(board[i][depth]=='O')
					mark(alive,i,depth);
		}
		for(int i=0;i<board.length;i++)
			for(int j=0;j<board[0].length;j++)
				if(board[i][j]=='O'&&!alive[i][j])
					board[i][j]='X';
	}

	private void mark(boolean[][] alive, int i, int j) {
		if(i==0||i==alive.length-1){
			alive[i][j]=true;
			return;
		}
		if(j==0||j==alive[0].length-1){
			alive[i][j]=true;
			return;
		}
		if(alive[i+1][j]||alive[i-1][j]||alive[i][j+1]||alive[i][j-1])
			alive[i][j]=true;
	}

}
