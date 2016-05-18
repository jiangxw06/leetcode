package main;

public class No59 {
	public int[][] generateMatrix(int n) {
		if(n<1)return new int[0][0];
		int[][] matrix=new int[n][n];
		int current=1;
		int l=n,x=0;
		for(int i=0;l>0;l-=2,x++){
			for(i=x;i<x+l-1;i++)
				matrix[x][i]=current++;
			for(i=x;i<x+l-1;i++)
				matrix[i][x+l-1]=current++;
			for(i=x+l-1;i>x;i--)
				matrix[x+l-1][i]=current++;
			for(i=x+l-1;i>x;i--)
				matrix[i][x]=current++;
		}
		if(l==1)
			matrix[x][x]=current;
		return matrix;

	}
}
