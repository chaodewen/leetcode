package com.leetcode.no338;

public class Solution {
	// 解法一：数学规律
	public int[] countBits(int num) {
		int[] dp = new int[num + 1];
		dp[0] = 0;
		for(int i = 1; i <= num; i ++) {
			if(i%2 == 0) {
				dp[i] = dp[i/2];
			}
			else {
				dp[i] = dp[i/2] + 1;
			}
		}
		return dp;
	}
	// 解法二：
	// 得到保留n最高位的1得到的数，如输入10（1010）得到8（1000）
//	public int getHighBits(int n) {
//		if(n == 0) {
//			return 0;
//		}
//		else if(n == 1) {
//			return 1;
//		}
//		else {
//			return (int) Math.pow(2, Math.floor((Math.log(n) / Math.log(2))));
//		}
//	}
//	public int[] countBits(int num) {
//		int[] dp = new int[num + 1];
//		dp[0] = 0;
//		for(int i = 1; i <= num; i ++) {
//			dp[i] = dp[i - getHighBits(i)] + 1;
//		}
//		return dp;
//	}
}