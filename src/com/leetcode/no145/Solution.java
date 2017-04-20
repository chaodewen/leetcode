package com.leetcode.no145;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
	// non-recursion
	public List<Integer> postorderTraversal(TreeNode root) {
		LinkedList<Integer> ans = new LinkedList<>();

		if(root == null)
			return ans;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			ans.addFirst(cur.val);
			if(cur.left != null)
				stack.push(cur.left);
			if(cur.right != null)
				stack.push(cur.right);
		}

		return ans;
	}
	// recursion
//	public List<Integer> postorderTraversal(TreeNode root) {
//		ArrayList<Integer> list = new ArrayList<>();
//
//		if(root == null)
//			return list;
//
//		list.addAll(postorderTraversal(root.left));
//		list.addAll(postorderTraversal(root.right));
//		list.add(root.val);
//
//		return list;
//	}
}