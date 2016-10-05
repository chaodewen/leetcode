package com.leetcode.no203;

import com.leetcode.ListNode;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        if(head == null)
            return head;
        ListNode p1 = head, p2 = head.next;
        while(p2 != null) {
            if(p2.val == val)
                p1.next = p2.next;
            else
                p1 = p1.next;
            p2 = p2.next;
        }
        return head;
    }
}