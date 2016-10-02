package com.leetcode.no145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	// non-recursion
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> valueList = new ArrayList<Integer>();
		if(root != null) {
			Stack<TreeNode> openTable = new Stack<TreeNode>();
			openTable.add(root);
			TreeNode last = root;
			while(!openTable.isEmpty()) {
				TreeNode node = openTable.peek();
				// node为叶子节点
				// 或node为上一个进入返回队列元素的父节点
				if(node.left == null && node.right == null
						|| node.left == last || node.right == last) {
					valueList.add(node.val);
					last = node;
					openTable.pop();
				}
				else {
					if(node.right != null) {
						openTable.push(node.right);
					}
					if(node.left != null) {
						openTable.push(node.left);
					}
				}
			}
		}
		return valueList;
	}
	// recursion
//	public List<Integer> postorderTraversal(TreeNode root) {
//		if(root == null) {
//			return new ArrayList<Integer>();
//		}
//		else {
//			List<Integer> list = new ArrayList<Integer>();
//			list.addAll(postorderTraversal(root.left));
//			list.addAll(postorderTraversal(root.right));
//			list.add(root.val);
//			return list;
//		}
//	}
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
		System.out.println(solution.postorderTraversal(a));
		System.out.println(solution.postorderTraversal(g));
		System.out.println(solution.postorderTraversal(null));
		System.out.println(solution.postorderTraversal(e));
	}
}