package com.leetcode.no234;

import com.leetcode.ListNode;

/**
 * Created by Cc on 2017/7/17.
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow是中点，rightMid存中点（奇数个节点）或右中点（偶数）
        ListNode rightMid = fast.next == null ? slow : slow.next;

        // 反向
        fast = slow.next;
        while(fast != null) {
            ListNode temp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = temp;
        }

        // slow是末尾节点且后半部分已经反向

        while(head != rightMid) {
            if(head.val != slow.val)
                return false;

            head = head.next;
            slow = slow.next;
        }

        return true;
    }
}