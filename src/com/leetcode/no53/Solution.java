package com.leetcode.no53;

public class Solution {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		dp[0] = nums[0];
		for(int i = 1; i < len; i ++) {
			if(dp[i - 1] < 0) {
				dp[i] = nums[i];
			}
			else {
				dp[i] = nums[i] + dp[i - 1];
			}
		}
		int max = dp[0];
		for(int i = 0; i < len; i ++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		return max;
	}
}