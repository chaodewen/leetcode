package com.leetcode.no19;

import com.leetcode.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(search(head, n) == n)
            return head.next;
        return head;
    }
    private int search(ListNode head, int n) {
        if(head.next == null)
            return 1;
        int nextIdx = search(head.next, n);
        if(nextIdx == n)
            head.next = head.next.next;
        return nextIdx + 1;
    }
}