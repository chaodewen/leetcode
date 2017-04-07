package com.leetcode.no236;

import com.leetcode.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root == p || root == q)
			return root; // 找不到或找到一个的情况

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if(left == null && right == null)
			return null;
		else if(left != null && right != null)
			return root; // 左右各找到了一个节点，此时根节点为公共祖先
		else
			return left == null ? right : left; // 找到其中一个节点时也返回
	}
}