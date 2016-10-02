package com.leetcode.no382;

import java.util.Random;

import com.leetcode.ListNode;

public class Solution {
	ListNode head;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
    	// 不要设置seed即可AC
    	Random rand = new Random();
        ListNode p = head;
        int count = 0, result = p.val;
        while(p != null) {
        	if(rand.nextInt(count + 1) == 0)
        		result = p.val;
        	p = p.next;
        	count ++;
        }
        return result;
    }
}