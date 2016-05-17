package main;

import java.util.LinkedList;

public class No116 {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size=queue.size();
			for(int i=0;i<size;i++){
				TreeLinkNode current = queue.poll();
				if(i<size-1)
					current.next=queue.peek();
				else
					current.next=null;
				if(current.left!=null)
					queue.add(current.left);
				if(current.right!=null)
					queue.add(current.right);
			}
		}
	}
}
