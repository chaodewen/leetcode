package com.leetcode.no337;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	Map<TreeNode, Integer> robValue = new HashMap<TreeNode, Integer>();
	public int rob(TreeNode root) {
		if(robValue.containsKey(root)) {
			return robValue.get(root);
		}
		else if(root == null) {
			robValue.put(root, 0);
        	return 0;
        }
        else {
        	int prob1 = rob(root.left) + rob(root.right);
        	int prob2 = root.val;
        	if(root.left != null) {
        		prob2 += rob(root.left.left) + rob(root.left.right);
        	}
        	if(root.right != null) {
        		prob2 += rob(root.right.left) + rob(root.right.right);
        	}
        	int value = prob1 > prob2 ? prob1 : prob2;
        	robValue.put(root, value);
        	return value;
        }
    }
}