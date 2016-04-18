package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import test.PrintResult;

public class No40 {
	private static int invoke = 0;

	/*
	 * start time:2016/4/17 12:16 end at: 12:54 dymanic programming
	 * ����ʵ��һ��NPC���⣬����ʹ�õ�Ҳ���Ƕ�̬�滮�����Ƿ��η�˼�� ������Ҫ�ñ�׼�Ļ��ݷ�����ʵ��һ�� ���ݷ����֦���編������
	 * 1.����˳��ͬ�����ݷ�������ռ�����˳����������ȵģ���֦���編�ǹ�����ȵ�
	 * 2.���Ŀ�겻ͬ�����ݷ������Ŀ�����ҳ���ռ���������Լ�����������н⣬����֧�޽編�����Ŀ�������ҳ�����Լ��������һ��������Ž⡣
	 */
	public List<List<Integer>> combinationSum2(int[] candidates, int target) throws Exception {
		Arrays.sort(candidates);
		int l = candidates.length;
		if (candidates == null || l == 0)
			return new ArrayList<List<Integer>>();
		// return combinationSum(candidates, l - 1, target);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> current = new ArrayList<Integer>();
		finSolusions(result, current, candidates, 0, target);
		// backtrack(target,candidates,result,current,0);
		return result;

	}

	/*
	 * �������ѵ�4ms��
	 */
	private void backtrack(int target, int[] candidates, List<List<Integer>> ans, List<Integer> branch, int start) {
		invoke++;
		System.out.println(invoke);
		if (target == 0) {
			ans.add(new ArrayList<>(branch));
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			if (target - candidates[i] >= 0) {
				branch.add(candidates[i]);
				backtrack(target - candidates[i], candidates, ans, branch, i + 1);
				branch.remove(branch.size() - 1);
				while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
					i++;
				}
			}
		}
	}

	/*
	 * ������д�Ļ��ݷ��� ѧ������ѭ������β�ݹ�
	 */
	private void finSolusions(List<List<Integer>> result, List<Integer> current, int[] nums, int start, int target)
			throws Exception {
		invoke++;
		System.out.println(invoke);
		PrintResult.show(current);
		System.out.println("i:" + start + " target:" + target);
		System.out.println();
		if (0 == target) {
			result.add(new ArrayList<Integer>(current));
			return;
		}
		for (int i = start; i < nums.length; i++) {
			if (nums[i] <= target) {
				current.add(nums[i]);
				finSolusions(result, current, nums, i + 1, target - nums[i]);
				current.remove(current.size() - 1);
				int j = i;
				while (j + 1 < nums.length && nums[i] == nums[j + 1])
					j++;
				i = j;
			} else
				break;
		}
	}

	/*
	 * ��д�İ���β�ݹ�ķ������ݹ���ô�����ȥ��β�ݹ�ķ�����һ����
	 */
	private void finSolusions2(List<List<Integer>> result, List<Integer> current, int[] nums, int start, int target)
			throws Exception {
		invoke++;
		System.out.println(invoke);
		PrintResult.show(current);
		System.out.println("i:" + start + " target:" + target);
		System.out.println();
		if (start >= nums.length || 0 > target)
			return;
		if (0 == target) {
			result.add(new ArrayList<Integer>(current));
			return;
		}

		current.add(nums[start]);
		finSolusions(result, current, nums, start + 1, target - nums[start]);
		current.remove(current.size() - 1);
		while (start + 1 < nums.length && nums[start] == nums[start + 1])
			start++;
		if (start + 1 < nums.length && nums[start + 1] <= target)
			finSolusions(result, current, nums, start + 1, target);

	}

	/*
	 * ��ԭ���ķ��� ����������:1���޷�ȥ��β�ݹ飻2��ÿһ����֧�������Ƿ��нⶼ��Ҫ��ʼ��һ����List��Ч�ʵ�
	 */
	private List<List<Integer>> combinationSum(int[] candidates, int right, int target) {
		invoke++;
		System.out.println(invoke);
		List<List<Integer>> coms = new ArrayList<List<Integer>>();
		if (right < 0 || target < 0)
			return coms;
		List<List<Integer>> comsYes;
		if (target - candidates[right] == 0) {
			comsYes = new ArrayList<List<Integer>>();
			List<Integer> list = new ArrayList<Integer>();
			list.add(target);
			comsYes.add(list);
		} else {
			comsYes = combinationSum(candidates, right - 1, target - candidates[right]);
			for (List<Integer> com : comsYes) {
				com.add(candidates[right]);
			}
		}
		int newRight = right;
		while (newRight >= 0 && candidates[right] == candidates[newRight])
			newRight--;
		List<List<Integer>> comsNo = combinationSum(candidates, newRight, target);
		comsYes.addAll(comsNo);
		return comsYes;
	}

}
