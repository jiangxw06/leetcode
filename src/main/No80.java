package main;

public class No80 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int dup = 0;
		int result = 1;
		for (int i = 1,j=1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				if (dup >= 1) {
					continue;
				}
				else{
					dup++;
				}
			}
			else
				dup = 0;
			nums[result]=nums[i];
			result++;
		}
		return result;
	}
}
