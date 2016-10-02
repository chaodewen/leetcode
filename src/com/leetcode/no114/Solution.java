package com.leetcode.no114;

import com.leetcode.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if(root == null)
        	return;
        else if(root.left == null)
        	flatten(root.right);
        else {
            if(root.left.left != null || root.left.right != null)
            	flatten(root.left);
            flatten(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            TreeNode temp2 = root.right;
            while(temp2.right != null)
            	temp2 = temp2.right;
            temp2.right = temp;
            root.left = null;
        }
    }
}