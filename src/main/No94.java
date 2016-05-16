package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> ancestors = new Stack<TreeNode>();
		TreeNode current = root;
		if (current == null)
			return result;
		while (current.left != null) {
			ancestors.push(current);
			current = current.left;
		}
		while (current != null) {
			result.add(current.val);
			current = next(current, ancestors);
		}
		return result;

	}

	private TreeNode next(TreeNode current, Stack<TreeNode> ancestors) {
		if (current.right != null) {
			ancestors.push(current);
			current = current.right;
			while (current.left != null) {
				ancestors.push(current);
				current = current.left;
			}
		} else {
			while (!ancestors.empty()) {
				if (ancestors.peek().left == current) {
					return ancestors.pop();
				}
				else{
					current = ancestors.pop();
				}
			} 
		}
		return null;
	}
}
