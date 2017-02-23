package com.leetcode.no105;

import com.leetcode.TreeNode;

/**
 * Created by Cc on 2017/2/23.
 */

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int plow, int phigh, int[] inorder, int ilow, int ihigh) {
        if(plow < 0 || ilow < 0 || plow > phigh || ilow > ihigh || phigh >= preorder.length || ihigh >= inorder.length)
            return null;

        TreeNode root = new TreeNode(preorder[plow]);
        int idx = find(preorder[plow], inorder, ilow, ihigh);
        root.left = helper(preorder, plow + 1, plow + idx - ilow, inorder, ilow, idx - 1);
        root.right = helper(preorder, plow + idx - ilow + 1, phigh, inorder, idx + 1, ihigh);
        return root;
    }
    private int find(int value, int[] arr, int low, int high) {
        for(; low <= high; low ++)
            if(arr[low] == value)
                break;
        return low;
    }
}