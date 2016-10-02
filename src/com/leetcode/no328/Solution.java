package com.leetcode.no328;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	else {
        	ListNode headEven = head.next
        			, p = headEven.next, pOdd = head, pEven = headEven;
        	while(p != null) {
        		pOdd.next = p;
        		pOdd = pOdd.next;
        		p = p.next;
        		if(p != null) {
        			pEven.next = p;
        			pEven = pEven.next;
        			p = p.next;
        		}
        	}
        	pOdd.next = headEven;
        	pEven.next = null;
        	return head;
        }
    }
}