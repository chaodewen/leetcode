package com.leetcode.no83;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return head;
		}
		else {
			ListNode p1 = head, p2 = head.next;
			while(p2 != null) {
				if(p1.val == p2.val) {
					p2 = p2.next;
					p1.next = p2;
				}
				else {
					p1 = p2;
					p2 = p2.next;
				}
			}
			return head;
		}
	}
}