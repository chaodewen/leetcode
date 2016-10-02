package com.leetcode.no231;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		return n <= 0 ? false : ((n & (n - 1)) == 0);
	}
	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo(-1));
	}
}