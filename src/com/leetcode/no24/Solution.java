package com.leetcode.no24;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head == null) {
			return null;
		}
		else if(head.next == null) {
			return head;
		}
		else {
			ListNode ln = head.next;
			head.next = swapPairs(ln.next);
			ln.next = head;
			return ln;
		}
	}
}