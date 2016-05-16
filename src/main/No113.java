package main;

import java.util.ArrayList;
import java.util.List;

public class No113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(result, new ArrayList<Integer>(), root, sum);
		return result;

	}

	private void helper(List<List<Integer>> result, List<Integer> path, TreeNode current, int remain) {
		if (current == null) {
			return;
		}
		if(current.val==remain&&current.left==null&&current.right==null){
			path.add(current.val);
			result.add(new ArrayList<Integer>(path));
			path.remove(path.size() - 1);
			return;
		}
		path.add(current.val);
		helper(result, path, current.left, remain - current.val);
		helper(result, path, current.right, remain - current.val);
		path.remove(path.size() - 1);
		return;
	}
}
