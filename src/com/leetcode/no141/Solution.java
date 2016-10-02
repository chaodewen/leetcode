package com.leetcode.no141;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		else {
			ListNode fast = head, slow = head;
			if(head.next != null) {
				fast = head.next.next;
				while(fast != slow) {
					if(fast == null || fast.next == null) {
						return false;
					}
					else {
						fast = fast.next.next;
						slow = slow.next;
					}
				}
				return true;
			}
			else {
				return false;
			}
		}
	}
}