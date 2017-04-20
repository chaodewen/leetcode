package com.leetcode.no230;

import java.util.ArrayList;
import java.util.List;
import com.leetcode.TreeNode;

public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = inorder(root);
		return list.get(k - 1);
	}
	private List<Integer> inorder(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if(root != null) {
			list.addAll(inorder(root.left));
			list.add(root.val);
			list.addAll(inorder(root.right));
		}
		return list;
	}
}