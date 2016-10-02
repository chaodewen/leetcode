package com.leetcode.no319;

public class Solution {
	// 找出平方数即可，因为只有平方数的因数是奇数个
	public int bulbSwitch(int n) {
		int cnt = 0;
		for(int i = 1; i * i <= n; i++) {
			cnt ++;
		}
		return cnt;
	}
}