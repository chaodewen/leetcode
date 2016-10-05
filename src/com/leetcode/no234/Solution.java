package com.leetcode.no234;

import com.leetcode.ListNode;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode left = head, right = reverse(slow);
        while(left != slow) {
            if(left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head) {
        if(head == null)
            return head;
        ListNode p1 = head, p2 = head.next, temp;
        while(p2 != null) {
            temp = p2;
            p2 = p2.next;
            temp.next = p1;
            p1 = temp;
        }
        head.next = null;
        return p1;
    }
}