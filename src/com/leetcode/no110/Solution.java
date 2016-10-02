package com.leetcode.no110;

class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
//	private int calDepth(TreeNode root) {
//		if(root == null) {
//			return 0;
//		}
//		else {
//			return Math.max(calDepth(root.left), calDepth(root.right)) + 1;
//		}
//	}
//	public boolean isBalanced(TreeNode root) {
//		if(root == null) {
//			return true;
//		}
//		else {
//			if((Math.abs(calDepth(root.left) - calDepth(root.right)) <= 1) 
//					&& isBalanced(root.left) && isBalanced(root.right)) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//	}
	private int calDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else {
			int left = calDepth(root.left), right = calDepth(root.right);
			if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
				return -1;
			}
			else {
				return (left > right ? left : right) + 1;
			}
		}
	}
	public boolean isBalanced(TreeNode root) {
		if(calDepth(root) == -1) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1), b = new TreeNode(2), c = new TreeNode(2)
				, d = new TreeNode(3), e = new TreeNode(3), f = new TreeNode(4), g = new TreeNode(4);
		a.left = b;
		a.right = c;
		b.left = d;
		c.right = e;
		d.left = f;
		e.right = g;
		System.out.println(new Solution().isBalanced(a));
	}
}