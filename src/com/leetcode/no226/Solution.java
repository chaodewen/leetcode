package com.leetcode.no226;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return root;
		}
		else {
			if(root.left == null && root.right == null) {
				return root;
			}
			else if(root.left == null) {
				root.left = root.right;
				root.right = null;
				invertTree(root.left);
			}
			else if(root.right == null) {
				root.right = root.left;
				root.left = null;
				invertTree(root.right);
			}
			else {
				TreeNode temp;
				temp = root.left;
				root.left = root.right;
				root.right = temp;
				invertTree(root.left);
				invertTree(root.right);
			}
		}
		return root;
	}
}