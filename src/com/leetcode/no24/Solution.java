package com.leetcode.no24;

import com.leetcode.ListNode;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode ln = head.next;
		head.next = swapPairs(ln.next);
		ln.next = head;
		return ln;
	}
}