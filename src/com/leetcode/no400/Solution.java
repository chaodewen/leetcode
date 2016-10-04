package com.leetcode.no400;

/**
 * Created by Cc on 16/10/5.
 */

public class Solution {
    public int findNthDigit(int n) {
        long temp = n, i = 1, factor = 9, base = 0;
        while(temp > i * factor) {
            base += factor;
            temp -= factor * i;
            factor *= 10;
            i ++;
        }
        long num = (temp + i - 1) / i + base, cnt = temp % i == 0 ? i : temp % i;
        num = num / ((long) Math.pow(10, i - cnt)) % 10;
        return (int) num;
    }
}