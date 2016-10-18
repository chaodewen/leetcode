package com.leetcode.no21;

import com.leetcode.ListNode;

public class Solution {
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if(l1 == null || l2 == null) {
//			return l1 == null ? l2 : l1;
//		}
//		else {
//			ListNode head, p;
//			if(l1.val < l2.val) {
//				head = l1;
//				p = head;
//				l1 = l1.next;
//			}
//			else {
//				head = l2;
//				p = head;
//				l2 = l2.next;
//			}
//			while(l1 != null && l2 != null) {
//				if(l1.val < l2.val) {
//					p.next = l1;
//					p = l1;
//					l1 = l1.next;
//				}
//				else {
//					p.next = l2;
//					p = l2;
//					l2 = l2.next;
//				}
//			}
//			if(l1 == null) {
//				p.next = l2;
//			}
//			else {
//				p.next = l1;
//			}
//			return head;
//		}
//	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null || l2 == null)
			return l1 == null ? l2 : l1;
		if(l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}