package main;

import java.util.Arrays;

public class No64 {
    public int minPathSum(int[][] grid) {
		if(grid==null||grid.length==0||grid[0].length==0)
			return -1;
		int[] sum=new int[grid[0].length];
		Arrays.fill(sum, Integer.MAX_VALUE);
		sum[0]=0;
		for(int i=0;i<grid.length;i++)
			for(int j=0;j<grid[0].length;j++)
				if(j==0)
					sum[j]=sum[j]+grid[i][j];
				else
					sum[j]=(sum[j-1]<sum[j]?sum[j-1]:sum[j])+grid[i][j];
		return sum[sum.length-1];
        
    }

}
