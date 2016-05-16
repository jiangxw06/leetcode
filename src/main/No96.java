package main;

import java.util.Arrays;

public class No96 {
	public int numTrees(int n) {
		if(n<1)
			return 0;
		int[] nums=new int[n+1];
		Arrays.fill(nums, 0);
		nums[0]=1;
		for(int num=1;num<=n;num++)
			for(int left=0;left<num;left++)
				nums[num]+=nums[left]*nums[num-left-1];
		return nums[n];
	}
}
