package com.leetcode.no103;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cc on 2017/4/26.
 */

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        ArrayList<TreeNode> level = new ArrayList<>();
        level.add(root);

        search(level, ans, true);

        return ans;
    }
    private void search(ArrayList<TreeNode> level, List<List<Integer>> ans, boolean l2r) {
        if(level.isEmpty())
            return;

        ArrayList<TreeNode> newLevel = new ArrayList<>();

        for(TreeNode node : level) {
            if(node.left != null)
                newLevel.add(node.left);
            if(node.right != null)
                newLevel.add(node.right);
        }

        ArrayList<Integer> list = new ArrayList<>();
        if(l2r)
            for(TreeNode node : level)
                list.add(node.val);
        else
            for(int i = level.size() - 1; i >= 0; i --)
                list.add(level.get(i).val);

        ans.add(list);

        search(newLevel, ans, !l2r);
    }
}