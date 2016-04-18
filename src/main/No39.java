package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No39 {
	/*
	 * start time:2016/4/16 21:36
	 * end at:22:18
	 * dymanic programming
	 * 搞清楚边界条件和状态转移方程
	 */
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		int l = candidates.length;
		if (candidates == null || l == 0)
			return new ArrayList<List<Integer>>();
		return combinationSum(candidates, l - 1, target);

	}

	public List<List<Integer>> combinationSum(int[] candidates, int right, int target) {
		List<List<Integer>> coms = new ArrayList<List<Integer>>();
		if (right < 0 || target < 0)
			return coms;
		if (target == 0) {
			coms.add(new ArrayList<Integer>());
			return coms;
		}
		List<List<Integer>> arraysYes = combinationSum(candidates, right, target - candidates[right]);
		List<List<Integer>> arraysNo = combinationSum(candidates, right - 1, target);
		for (List<Integer> arrayYes : arraysYes) {
			arrayYes.add(candidates[right]);

		}
		arraysYes.addAll(arraysNo);
		return arraysYes;

	}
}
