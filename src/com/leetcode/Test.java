package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Dewayne on 2017/4/10.
 */

public class Test {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> level = new LinkedList<>();

        if(root != null)
            level.offer(root);

        while(!level.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while(!level.isEmpty()) {
                TreeNode node = level.poll();
                String ins = (node == null) ? "#" : String.valueOf(node.val);

                if(sb.length() == 0)
                    sb.append(ins);
                else
                    sb.append("," + ins);

                if(node != null) {
                    nextLevel.offer(node.left);
                    nextLevel.offer(node.right);
                }
            }
            level = nextLevel;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Test t = new Test();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(t.serialize(root));
    }
}