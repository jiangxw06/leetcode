package main;

public class No55 {
	public boolean canJump(int[] nums) {
		if(nums==null||nums.length==0)
			return false;
		int farthest=0;
		for (int i = 0; i < nums.length&&i<=farthest; i++) {
			if (nums[i]+i>farthest){
				farthest=nums[i]+i;
			}
		}
		return farthest>=nums.length-1;
	}
}
