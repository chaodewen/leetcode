package com.leetcode.no160;

import com.leetcode.ListNode;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    /**
     * 算出两个链表节点数目差diff
     * 然后长的向前移动diff
     * 再同时向前移动找到相同节点
     */
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // 	if(headA == null || headB == null)
    // 		return null;

    //     ListNode pa = headA, pb = headB;
    //     int diff = 0;

    //     while(pa.next != null || pb.next != null) {
    //     	if(pa.next == null) {
    //     		diff ++;
    //     		pb = pb.next;
    //     	}
    //     	else if(pb.next == null) {
    //     		diff --;
    //     		pa = pa.next;
    //     	}
    //     	else {
    //     		pa = pa.next;
    //     		pb = pb.next;
    //     	}
    //     }

    //     if(pa != pb)
    //     	return null;

    //     ListNode p1 = (diff > 0) ? headB : headA, p2 = (diff > 0) ? headA : headB;
    //     diff = (diff >= 0) ? diff : - diff;

    //     while((diff --) > 0)
    //     	p1 = p1.next;

    //     while(p1 != p2) {
    //     	p1 = p1.next;
    //     	p2 = p2.next;
    //     }

    //     return p1;
    // }
    /**
     * 两个链表同时向前遍历
     * 遍历结束的指针指向另一个链表的头
     * 这样弥补了两个链表的节点数目差
     * 如果到达同为null说明不想交，到达同一个节点说明是交点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        ListNode pa = headA, pb = headB;

        while(pa != pb) {
            pa = pa.next;
            pb = pb.next;
            if(pa == null && pb == null)
                return null;
            else if(pa == null)
                pa = headB;
            else if(pb == null)
                pb = headA;
        }

        return pa;
    }
}