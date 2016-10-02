package com.leetcode.no112;

import com.leetcode.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(sum == root.val && root.left == null && root.right == null)
            return true;
        if(root.left != null && hasPathSum(root.left, sum - root.val))
            return true;
        if(root.right != null && hasPathSum(root.right, sum - root.val))
            return true;
        return false;
    }
}