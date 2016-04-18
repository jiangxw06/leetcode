package main;

import java.util.ArrayList;
import java.util.List;

public class AllSubSet {
	public List<List<Integer>> printAllSubset(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		findSubsets(result, current, nums, 0);
		return result;
	}

	/*
	 * 用回溯法实现返回一个集合的所有子集
	 */
	private void findSubsets(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
		result.add(new ArrayList<Integer>(current));
		if (start < nums.length)
			for (int i = start; i < nums.length; i++) {
				current.add(nums[i]);
				findSubsets(result, current, nums, i + 1);
				current.remove(current.size() - 1);
			}
	}
}
