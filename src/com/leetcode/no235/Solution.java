package com.leetcode.no235;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean isEqual(TreeNode node1, TreeNode node2) {
		if(node1 == null && node2 == null) {
			return true;
		}
		else if(node1 == null || node2 == null) {
			return false;
		}
		else {
			if(node1.val == node2.val && node1.left == node2.left && node1.right == node2.right) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public boolean searchNode(TreeNode root, TreeNode node) {
		if(node == null) {
			return true;
		}
		else if(isEqual(root, node)) {
			return true;
		}
		else {
			if(root == null) {
				return false;
			}
			else {
				if(searchNode(root.left, node) || searchNode(root.right, node)) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(searchNode(root.left, p) && searchNode(root.left, q)) {
			return lowestCommonAncestor(root.left, p, q);
		}
		else if(searchNode(root.right, p) && searchNode(root.right, q)) {
			return lowestCommonAncestor(root.right, p, q);
		}
		else if(searchNode(root, p) && searchNode(root, q)){
			return root;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode a = new TreeNode(3), b = new TreeNode(8), c = new TreeNode(7)
				, d = new TreeNode(6), e = new TreeNode(5), f = new TreeNode(4)
				, g = new TreeNode(2), h = new TreeNode(9);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		e.left = f;
		e.right = g;
		System.out.println(solution.lowestCommonAncestor(a, d, h).val);
	}
}