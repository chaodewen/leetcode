package com.leetcode.no100;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		@SuppressWarnings("unused")
		int val = x;
	}
}

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}
		else if(p == null || q == null){
			return false;
		}
		else if(p.val == q.val) {
			if(p.left != null) {
				if(q.left == null) {
					return false;
				}
				else {
					if(!isSameTree(p.left, q.left)) {
						return false;
					}
				}
			}
			else {
				if(q.left != null) {
					return false;
				}
			}
			
			if(p.right != null) {
				if(q.right == null) {
					return false;
				}
				else {
					if(!isSameTree(p.right, q.right)) {
						return false;
					}
				}
			}
			else {
				if(q.right != null) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode a = new TreeNode(3), b = new TreeNode(8), c = new TreeNode(7)
				, d = new TreeNode(6), e = new TreeNode(5), f = new TreeNode(4)
				, g = new TreeNode(2);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		e.left = f;
		e.right = g;
		System.out.println(solution.isSameTree(a, null));
	}
}