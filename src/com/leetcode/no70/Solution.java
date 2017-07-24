package com.leetcode.no70;

public class Solution {
    public int climbStairs(int n) {
        int last = 1, ans = 1;

        for(int i = 2; i <= n; i ++) {
            int temp = ans;
            ans += last;
            last = temp;
        }

        return ans;
    }
}