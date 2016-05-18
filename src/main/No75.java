package main;

public class No75 {
	public void sortColors(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int lastRed = -1, lastWhite = -1, lastBlue = -1;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 2)
				lastBlue++;
			else if (nums[i] == 1) {
				lastBlue++;
				lastRed++;
				swap(nums, lastBlue, lastRed);
			} else {
				lastBlue++;
				lastRed++;
				lastWhite++;
				swap(nums, lastBlue, lastWhite);
				if (lastRed != lastWhite)
					swap(nums, lastBlue, lastRed);
			}
	}

	private void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
