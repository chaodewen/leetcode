package com.leetcode.no309;

public class Solution {
//	public int maxProfit(int[] prices) {
//		int len = prices.length;
//		if(len <= 1) {
//			return 0;
//		}
//		else {
//			// 0:buy, 1:sell or hold, 2:cooldown, 3:wait
//			int[][] dp = new int[len][4];
//			
//			for(int i = 1; i < len; i ++) {
//				int differ = prices[i] - prices[i - 1];
//				dp[i][0] = Integer.max(dp[i - 1][2], dp[i - 1][3]);
//				dp[i][1] = differ + Integer.max(dp[i - 1][0], dp[i - 1][1]);
//				dp[i][2] = dp[i - 1][1];
//				dp[i][3] = Integer.max(dp[i - 1][2], dp[i - 1][3]);
//			}
//			
//			return Integer.max(dp[len - 1][0], Integer.max(dp[len - 1][1], dp[len - 1][2]));
//		}
//	}
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if(len <= 1) {
			return 0;
		}
		else {
			// 0:sell, 1:cooldown
			int[][] dp = new int[len][2];
			
			dp[1][0] = prices[1] - prices[0];
			
			for(int i = 2; i < len; i ++) {
				// 此时sell说明前一时刻是sell（代表持有）或前两个时刻是cooldown
				dp[i][0] = prices[i] - prices[i - 1] 
						+ Math.max(dp[i - 1][0], dp[i - 2][1]);
				// 此时cooldown说明前一时刻是sell或cooldown（代表持有）
				dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
			}
			
			return Math.max(dp[len - 1][0], dp[len - 1][1]);
		}
	}
}