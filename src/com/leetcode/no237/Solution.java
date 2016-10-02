package com.leetcode.no237;

class TreeNode {
	int val;
	TreeNode next;
	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public void deleteNode(TreeNode node) {
		TreeNode nextNode = node.next;
		node.val = nextNode.val;
		node.next = nextNode.next;
	}
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		
		TreeNode temp = a;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
		
		Solution solution = new Solution();
		solution.deleteNode(c);
		
		temp = a;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}