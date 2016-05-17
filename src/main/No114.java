package main;

public class No114 {
	public void flatten(TreeNode root) {
		if(root==null)
			return;
		helper(root);
	}
	
	private TreeNode helper(TreeNode root){
		if(root.left==null&&root.right==null)
			return root;
		TreeNode right = root.right;
		if(root.left!=null){
			TreeNode leftLast = helper(root.left);
			root.right=root.left;
			root.left=null;
			leftLast.right=right;
			if(right==null)
				return leftLast;
		}
		return helper(right);
	}
}
