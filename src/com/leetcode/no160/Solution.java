package com.leetcode.no160;

import com.leetcode.ListNode;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode p1 = headA, p2 = headB;
        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if(p1 == null && p2 == null)
                return null;
            if(p1 == null)
                p1 = headB;
            if(p2 == null)
                p2 = headA;
        }
        return p1;
    }
}