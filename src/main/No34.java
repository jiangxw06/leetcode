package main;

public class No34 {
	public int[] SearchRange(int[] nums, int target) {
		int left=findLeft(nums,0,nums.length-1,target);
		int right=findRight(nums,0,nums.length-1,target);
		return new int[]{left,right};
	}
	
	public int findLeft(int[] nums,int start,int end,int target){
		//if(nums[start]>target||end<start)//会导致bug:start如果是上一层findLeft的middle+1，有可能超出数组边界
		if(end<start||nums[start]>target)
			return -1;
		if(nums[start]==target)
			return start;
		int middle=(start+end)/2;
		if(nums[middle]>=target)
			return findLeft(nums,start,middle,target);
		else
			return findLeft(nums,middle+1,end,target);
	}
	public int findRight(int[] nums,int start,int end,int target){
		if(end<start||nums[end]<target)
			return -1;
		if(nums[end]==target)
			return end;
		int middle=(start+end+1)/2;
		if(nums[middle]<=target)
			return findRight(nums,middle,end,target);
		else
			return findRight(nums,start,middle-1,target);
	}
}
