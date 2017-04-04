package com.leetcode.no264;

/**
 * Created by Cc on 2017/4/5.
 */

class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1; // 1是第一个丑数

        int i2 = 0, i3 = 0, i5 = 0; // 指向下一次要乘的值

        for(int i = 1; i < n; i ++) {
            int min = Math.min(Math.min(ugly[i2] * 2, ugly[i3] * 3), ugly[i5] * 5);

            if(min == ugly[i2] * 2)
                i2 ++;
            if(min == ugly[i3] * 3) // 不能使用else，因为可能出现多个if条件相等的情况
                i3 ++;
            if(min == ugly[i5] * 5)
                i5 ++;

            ugly[i] = min;
        }

        return ugly[n - 1];
    }
}