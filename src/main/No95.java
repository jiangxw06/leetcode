package main;

import java.util.ArrayList;
import java.util.List;

public class No95 {
	public List<TreeNode> generateTrees(int n) {

		return helper(1, n);

	}

	private List<TreeNode> helper(int left, int right) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if (left > right)
			return result;
		for (int i = left; i <= right; i++) {
			List<TreeNode> leftList = helper(left, i - 1);
			List<TreeNode> rightList = helper(i + 1, right);
			if(leftList.size()==0)
				leftList.add(null);
			if(rightList.size()==0)
				rightList.add(null);
			for(TreeNode leftNode:leftList)
				for(TreeNode rightNode:rightList){
					TreeNode root = new TreeNode(i);
					root.left=leftNode;
					root.right=rightNode;
					result.add(root);
				}
			
		}
		return result;
	}
}
