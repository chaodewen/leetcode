package com.leetcode.no297;

import com.leetcode.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Dewayne on 2017/4/10.
 */

public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    private void buildString(TreeNode root, StringBuilder sb) {
        if(root == null)
            sb.append("#,");
        else {
            sb.append(root.val).append(",");
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
    }
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return buildTree(queue);
    }
    private TreeNode buildTree(Queue<String> queue) {
        String val = queue.poll();
        if(val.equals("#"))
            return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(queue);
            node.right = buildTree(queue);
            return node;
        }
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(codec.serialize(root));
        TreeNode root2 = codec.deserialize(codec.serialize(root));
        System.out.println(codec.serialize(root2));
    }
}