package main;

import java.util.ArrayDeque;

public class No129 {
	public int sumNumbers(TreeNode root) {
		if(root==null)
			return 0;
		ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
		queue.add(root);
		int sum=0;
		while(!queue.isEmpty()){
			TreeNode current = queue.poll();
			if(current.left==null&&current.right==null)
				sum+=current.val;
			else{
				if(current.left!=null){
					current.left.val+=current.val*10;
					queue.add(current.left);
				}
				if(current.right!=null){
					current.right.val+=current.val*10;
					queue.add(current.right);
				}
			}
		}
		return sum;

	}
}
