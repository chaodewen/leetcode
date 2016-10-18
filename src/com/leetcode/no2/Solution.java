package com.leetcode.no2;

import com.leetcode.ListNode;

/**
 * Created by Dewayne on 2016/10/17.
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
        ListNode p1 = l1, p2 = l2, head = null, p = null;
        int carry = 0;
        while(p1 != null || p2 != null || carry > 0) {
            if(carry == 0 && (p1 == null || p2 == null)) {
                p.next = p1 == null ? p2 : p1;
                break;
            }
            int sum = carry;
            if(p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            if(p == null) {
                p = new ListNode(sum % 10);
                head = p;
            }
            else {
                p.next = new ListNode(sum % 10);
                p = p.next;
            }
            carry = sum / 10;
        }
        return head;
    }
}