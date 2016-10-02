package com.leetcode.no342;

public class Solution {
    public boolean isPowerOfFour(int num) {
    	// 0xAAAAAAAA的所有奇数位是0，偶数位是1
        return num > 0 && (num & (num - 1)) == 0 && (num & 0xAAAAAAAA) == 0;
    }
}