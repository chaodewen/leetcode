package com.leetcode.no143;

import com.leetcode.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
    	if(head == null || head.next == null)
    		return;
        ListNode p1 = head, p2 = head.next;
        while(p2 != null && p2.next != null) {
        	p1 = p1.next;
        	p2 = p2.next.next;
        }
        p2 = p1.next;
        p1.next = null;
        p2 = reverse(p2);
        p1 = head;
        while(p2 != null) {
        	ListNode temp = p1.next;
        	ListNode temp2 = p2.next;
        	p1.next = p2;
        	p2.next = temp;
        	p1 = temp;
        	p2 = temp2;
        }
    }
    private ListNode reverse(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode p1 = head, p2 = head.next;
    	while(p2 != null) {
    		ListNode temp = p2;
    		p2 = p2.next;
    		temp.next = p1;
    		p1 = temp;
    	}
    	head.next = null;
    	return p1;
    }
}