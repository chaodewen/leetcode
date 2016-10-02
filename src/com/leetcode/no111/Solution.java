package com.leetcode.no111;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
    public int minDepth(TreeNode root) {
    	if(root == null)
    		return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int cnt = 1, depth = 1;
        while(!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	cnt --;
        	if(node.left == null && node.right == null)
        		break;
        	if(node.left != null) {
        		queue.offer(node.left);
        	}
        	if(node.right != null) {
        		queue.offer(node.right);
        	}
        	if(cnt == 0) {
        		depth ++;
        		cnt = queue.size();
        	}
        }
        return depth;
    }
}