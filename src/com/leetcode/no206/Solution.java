package com.leetcode.no206;

import com.leetcode.ListNode;

public class Solution {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		else {
			ListNode p1 = head, p2 = head.next;
			ListNode temp;
			while(p2 != null) {
				temp = p1;
				p1 = p2;
				p2 = p2.next;
				p1.next = temp;
			}
			head.next = null;
			return p1;
		}
	}
}