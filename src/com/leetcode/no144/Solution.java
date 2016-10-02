package com.leetcode.no144;

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
	public List<Integer> preorderTraversal(TreeNode root) {
		list = new LinkedList<Integer>();
		if(root == null) {
			return list;
		}
		else {
			makePreorder(root);
			return list;
		}
	}
	private void makePreorder(TreeNode node) {
		if(node != null) {
			list.add(node.val);
			makePreorder(node.left);
			makePreorder(node.right);
		}
	}
}