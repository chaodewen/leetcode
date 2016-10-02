package com.leetcode.no122;

public class Solution {
	public int maxProfit(int[] prices) {
		if(prices.length < 2) {
			return 0;
		}
		else {
			int result = 0;
			
			for(int i = 1; i < prices.length; i ++) {
				if(prices[i] > prices[i - 1]) {
					result += prices[i] - prices[i - 1];
				}
			}
			return result;
		}
	}
}