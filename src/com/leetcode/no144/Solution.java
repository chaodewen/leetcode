package com.leetcode.no144;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();

		if(root == null)
			return ans;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			ans.add(cur.val);
			if(cur.right != null)
				stack.push(cur.right);
			if(cur.left != null)
				stack.push(cur.left);
		}

		return ans;
	}
}