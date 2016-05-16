package main;

import java.util.Stack;

public class No98 {
	public boolean isValidBST(TreeNode root) {
		Integer largest = null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (root != null) {
			stack.push(root);
			root = root.left;
			while (root == null) {
				if (stack.empty())
					return true;
				root = stack.pop();
				if (largest != null && largest >= root.val)
					return false;
				largest = root.val;
				largest = root.val;
				root = root.right;
			}
		}
		return true;
	}

}
