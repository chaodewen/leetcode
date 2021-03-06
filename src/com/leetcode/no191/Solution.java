package com.leetcode.no191;

public class Solution {
	public int hammingWeight(int n) {
		int cnt = 0;
		while(n != 0) {
			if((n & 1) != 0) {
				cnt ++;
			}
			n >>>= 1;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().hammingWeight(-2147483648));
	}
}