package com.leetcode.no104;

import com.leetcode.TreeNode;

public class Solution {
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else if(root.left == null && root.right == null) {
			return 1;
		}
		else {
			int left = 1, right = 1;
			
			if(root.left != null) {
				left += maxDepth(root.left);
			}
			
			if(root.right != null) {
				right += maxDepth(root.right);
			}
			
			return left > right ? left : right;
		}
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
		System.out.println(solution.maxDepth(a));
		System.out.println(solution.maxDepth(f));
	}
}
