package com.leetcode.no404;

import com.leetcode.TreeNode;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null 
            && root.left.right == null)
            sum += root.left.val;
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return sum;
    }
}