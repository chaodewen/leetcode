package com.leetcode.no107;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.leetcode.TreeNode;

public class Solution {
	private void getLeaves(List<List<Integer>> ret, List<TreeNode> list) {
		List<TreeNode> leaves = new ArrayList<TreeNode>();
		List<Integer> values = new ArrayList<Integer>();
		Iterator<TreeNode> it = list.iterator();
		TreeNode node;
		while(it.hasNext()) {
			node = it.next();
			values.add(node.val);
			if(node.left != null) {
				leaves.add(node.left);
			}
			if(node.right != null) {
				leaves.add(node.right);
			}
		}
		if(!leaves.isEmpty()) {
			getLeaves(ret, leaves);
		}
		ret.add(values);
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if(root != null) {
			List<TreeNode> list = new ArrayList<TreeNode>();
			list.add(root);
			getLeaves(ret, list);
			
		}
		return ret;
	}
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		Solution solution = new Solution();
		System.out.println(solution.levelOrderBottom(a));
	}
}