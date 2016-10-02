package com.leetcode.no116;

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) {
		val = x;
	}
}

public class Solution {
	public void connect(TreeLinkNode root) {
		if(root != null) {
			link(root.left, root.right);
		}
	}
	public void link(TreeLinkNode left, TreeLinkNode right) {
		if(left != null) {
			left.next = right;
			if(right != null) {
				link(left.right, right.left);
				link(right.left, right.right);
			}
			link(left.left, left.right);
		}
	}
}