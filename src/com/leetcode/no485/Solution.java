package com.leetcode.no485;

/**
 * Created by Cc on 2017/2/18.
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, cntNow = 0;
        for(int i : nums) {
            if(i == 1) {
                cntNow++;
            }
            else {
                if(cntNow > cnt)
                    cnt = cntNow;

                cntNow = 0;
            }
        }
        return cnt > cntNow ? cnt : cntNow;
    }
}