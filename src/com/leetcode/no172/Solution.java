package com.leetcode.no172;

public class Solution {
    public int trailingZeroes(int n) {
    	// 使用long防止i的溢出
    	long cnt = 0;
    	for(long i = 5; i <= n; i *= 5)
    		cnt += n / i;
    	return (int) cnt;
    }
}