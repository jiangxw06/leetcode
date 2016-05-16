package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class No103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		boolean reverse = false;
		list.add(root);
		while (!list.isEmpty()) {
			List<Integer> tier = new ArrayList<Integer>();
			int size = list.size();
			TreeNode current;
			if(reverse){
				for(int i=size-1;i>=0;i--)
					tier.add(list.get(i).val);
			}
			else
				for(int i=0;i<size;i++)
					tier.add(list.get(i).val);
			reverse = !reverse;
			result.add(tier);
			for (int i = 0; i < size; i++) {
				current = list.pollFirst();
				if (current.left != null)
					list.add(current.left);
				if (current.right != null)
					list.add(current.right);
			}
			
		}
		return result;
	}
}
