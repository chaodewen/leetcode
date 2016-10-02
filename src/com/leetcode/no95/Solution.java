package com.leetcode.no95;

import java.util.ArrayList;
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
	public List<TreeNode> generateTrees(int n) {
		if (n == 0) {
			return new ArrayList<TreeNode>();
		} else {
			return buildTree(1, n);
		}
	}

	private List<TreeNode> buildTree(int start, int end) {
		List<TreeNode> list = new ArrayList<>();
		if (start > end) {
			list.add(null);
		} else {
			for (int i = start; i <= end; i++) {
				List<TreeNode> leftList = buildTree(start, i - 1);
				List<TreeNode> rightList = buildTree(i + 1, end);
				for (TreeNode left : leftList) {
					for (TreeNode right : rightList) {
						TreeNode p = new TreeNode(i);
						p.left = left;
						p.right = right;
						list.add(p);
					}
				}
			}
		}
		return list;
	}
}