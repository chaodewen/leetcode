package com.leetcode.no117;

//import java.util.Stack;

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) {
		val = x;
	}
}

public class Solution {
	// Time Limit Exceeded
//	private void connectNear(TreeLinkNode a, TreeLinkNode b) {
//		if(a != null || b != null) {
//			if(a != null && b == null) {
//				a.next = null;
//				connectNear(a.left, a.right);
//			}
//			else if(a == null && b != null) {
//				b.next = null;
//				connectNear(b.left, b.right);
//			}
//			else {
//				a.next = b;
//				b.next = null;
//				Stack<TreeLinkNode> stack = new Stack<TreeLinkNode>();
//				if(a.left != null) {
//					stack.push(a.left);
//				}
//				if(a.right != null) {
//					stack.push(a.right);
//				}
//				if(b.left != null) {
//					stack.push(b.left);
//				}
//				if(b.right != null) {
//					stack.push(b.right);
//				}
//				if(!stack.empty()) {
//					TreeLinkNode node = null;
//					while(!stack.empty()) {
//						connectNear(stack.peek(), node);
//						node = stack.pop();
//					}
//				}
//			}
//		}
//	}
//	public void connect(TreeLinkNode root) {
//		if(root != null) {
//			root.next = null;
//			connectNear(root.left, root.right);
//		}
//	}
	public void connect(TreeLinkNode root) {
		TreeLinkNode dummyHead = new TreeLinkNode(0);
		TreeLinkNode now = dummyHead;
		while(root != null) {
			if(root.left != null) {
				now.next = root.left;
				now = now.next;
			}
			if(root.right != null) {
				now.next = root.right;
				now = now.next;
			}
			root = root.next;
			if(root == null) {
				root = dummyHead.next;
				dummyHead.next = null;
				now = dummyHead;
			}
		}
	}
}