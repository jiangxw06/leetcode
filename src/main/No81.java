package main;

public class No81 {
	public boolean search(int[] nums, int target) {
		if (nums == null | nums.length == 0)
			return false;
		if (target == nums[0])
			return true;
		return search(nums, target, 0, nums.length - 1);

	}

	private boolean search(int[] nums, int target, int i, int j) {
		if (i > j)
			return false;
		if(i==j)
			return target==nums[i];
		int middle = (i + j) / 2;
		if (nums[middle] == target)
			return true;
		if(nums[middle]==nums[0]){
			return search(nums, target, i, middle - 1)||search(nums, target, middle + 1, j);
		}
		if ((nums[middle] < target && target < nums[0]) || (nums[middle] > nums[0] && target < nums[0])
				||(nums[0]<nums[middle]&&nums[middle]<target))
			return search(nums, target, middle + 1, j);
		else
			return search(nums, target, i, middle - 1);
	}
}
