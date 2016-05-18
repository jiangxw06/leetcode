package main;

public class No53 {
	public int maxSubArray(int[] nums) {
		int sum=Integer.MIN_VALUE;
		int max=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum<0)
				sum=0;
			else if(sum>max)
				max=sum;
		}
		return max;

	}
}
