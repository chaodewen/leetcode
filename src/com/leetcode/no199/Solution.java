package com.leetcode.no199;

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
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> list = new ArrayList<>();
        if(root != null) {
        	list.add(root.val);
        	if(root.left != null || root.right != null) {
        		List<Integer> left = rightSideView(root.left);
	        	List<Integer> right = rightSideView(root.right);
	        	int len = Math.max(left.size(), right.size());
	        	int i = 0;
	        	while(i < right.size()) {
	        		list.add(right.get(i ++));
	        	}
	        	while(i < len) {
	        		list.add(left.get(i ++));
	        	}
        	}
        }
        return list;
    }
}