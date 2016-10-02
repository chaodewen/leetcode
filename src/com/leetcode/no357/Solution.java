package com.leetcode.no357;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
        	return 1;
        if(n == 1)
        	return 10;
        // sum存储i位数可能情况的和，temp在循环中存储有i位时可能的情况
        int sum = 10, temp = 9;
        for(int i = 2; i <= n; i ++) {
        	temp *= (11 - i);
        	sum += temp;
        }
        return sum;
    }
}