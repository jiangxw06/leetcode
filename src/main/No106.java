package main;

import java.util.HashMap;
import java.util.Map;

public class No106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(inorder==null|inorder.length==0)
			return null;
		Map<Integer,Integer> inorderMap = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++)
			inorderMap.put(inorder[i], i);
		return helper(inorder,0,inorder.length-1,inorderMap,postorder,0,inorder.length-1);
	}
	
	private TreeNode helper(int[] inorder,int inLeft,int inRight,Map<Integer,Integer> inorderMap,int[] postorder,int postLeft,int postRight){
		if(inLeft>inRight)
			return null;
		TreeNode root = new TreeNode(postorder[postRight]);
		int inRoot=inorderMap.get(postorder[postRight]);
		int leftSize=inRoot-inLeft;
		root.left=helper(inorder,inLeft,inRoot-1,inorderMap,postorder,postLeft,postLeft+leftSize-1);
		root.right=helper(inorder,inRoot+1,inRight,inorderMap,postorder,postLeft+leftSize,postRight-1);
		return root;
	}
}
