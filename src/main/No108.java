package main;

public class No108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null | nums.length == 0)
			return null;
		return helper(nums, 0, nums.length - 1);
	}

	private TreeNode helper(int[] nums, int i, int j) {
		if (i > j)
			return null;
		int k = (i+j)/2;
		TreeNode root =new TreeNode(nums[k]);
		root.left=helper(nums,i,k-1);
		root.right=helper(nums,k+1,j);
		return root;
	}
}
