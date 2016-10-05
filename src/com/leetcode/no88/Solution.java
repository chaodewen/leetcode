package com.leetcode.no88;

/**
 * Created by Dewayne on 2016/10/5.
 */

public class Solution {
    // 从后向前遍历
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        if(m == 0) {
            for(int i = 0; i < n; i ++)
                nums1[i] = nums2[i];
            return;
        }
        int p1 = m - 1, p2 = n - 1;
        for(int i = m + n - 1; i >= 0; i --)
            if(p1 < 0)
                nums1[i] = nums2[p2 --];
            else if(p2 < 0)
                nums1[i] = nums1[p1 --];
            else if(nums1[p1] > nums2[p2])
                nums1[i] = nums1[p1 --];
            else
                nums1[i] = nums2[p2 --];
    }
}