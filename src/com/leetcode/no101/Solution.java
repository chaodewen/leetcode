package com.leetcode.no101;

class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	private boolean isSym(TreeNode a, TreeNode b) {
		if(a == null && b == null) {
			return true;
		}
		else if(a == null && b!= null || a != null && b == null) {
			return false;
		}
		else if(a.val == b.val) {
			return isSym(a.left, b.right) && isSym(a.right, b.left);
		}
		else {
			return false;
		}
	}
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		else {
			return isSym(root.left, root.right);
		}
	}
}