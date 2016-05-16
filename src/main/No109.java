package main;

public class No109 {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		int len = 0;
		ListNode current = head;
		while (current != null) {
			len++;
			current = current.next;
		}
		current = head;
		return helper(current, 0, len - 1);
	}

	private TreeNode helper(ListNode current, int i, int j) {
		if (i > j)
			return null;
		int k=(i+j)/2;
		TreeNode root=new TreeNode(0);
		root.left = helper(current,i,k-1);
		root.val=current.val;
		current=current.next;
		root.right=helper(current,k+1,j);
		return root;
	}
}
