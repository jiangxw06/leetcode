package main;

public class No105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || preorder.length == 0)
			return null;
		TreeNode root;
		root = helper(preorder, 0, preorder.length - 1,inorder, 0, preorder.length - 1);
		return root;

	}

	private TreeNode helper(int[] preorder, int preLeft, int preRight,int[] inorder,int inLeft, int inRight ) {
		if (preLeft > preRight)
			return null;
		TreeNode root = new TreeNode(preorder[preLeft]);
		int inRoot = 0;
		for (int i = inLeft; i <= inRight; i++)
			if (preorder[preLeft] == inorder[i]) {
				inRoot = i;
				break;
			}
		int leftSize=inRoot-inLeft;
		root.left = helper(preorder,preLeft+1,preLeft+leftSize,inorder,inLeft,inRoot-1);
		root.right = helper(preorder,preLeft+leftSize+1,preRight,inorder,inRoot+1,inRight);
		return root;
	}
}
