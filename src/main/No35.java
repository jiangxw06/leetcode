package main;

public class No35 {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0)
        	return -1;
        if(target<nums[0])
        	return 0;
        if(target>nums[nums.length-1])
        	return nums.length;
        return searchInsert(nums,0,nums.length-1,target);
    }
    public int searchInsert(int[] nums, int left,int right,int target){
    	if(left==right)
    		return left;
    	int middle=(left+right)/2;
    	if(nums[middle]==target)
    		return middle;
    	if(nums[middle]<target)
    		return searchInsert(nums,middle+1,right,target);
    	return searchInsert(nums,left,middle,target);
    }
}
