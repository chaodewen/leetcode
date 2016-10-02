package com.leetcode.no94;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	private List<Integer> list;
	public List<Integer> inorderTraversal(TreeNode root) {
		list = new LinkedList<Integer>();
		if(root == null) {
			return list;
		}
		else {
			makeInorder(root);
			return list;
		}
	}
	private void makeInorder(TreeNode node) {
		if(node != null) {
			makeInorder(node.left);
			list.add(node.val);
			makeInorder(node.right);
		}
	}
}