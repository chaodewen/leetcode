package com.leetcode.no94;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();

		if(root == null)
			return ans;

		Stack<TreeNode> stack = new Stack<>();

		TreeNode cur = root;

		while(cur != null || !stack.isEmpty()) {
			while(cur != null) { // 将cur左边一路放入stack
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop(); // cur存最左边的节点或stack中原先存在的节点
			ans.add(cur.val); // 这个节点就是当前要处理的节点
			cur = cur.right; // 处理完中间开始处理右边（右边空时就处理栈中遗留的节点）
		}

		return ans;
	}
}