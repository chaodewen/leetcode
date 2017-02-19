package com.leetcode.no122;

public class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		for(int low = 0, high = 1; high < prices.length;) {
			if(prices[high] < prices[high - 1])
				low = high ++;
			else {
				while(high < prices.length && prices[high] >= prices[high - 1])
					high ++;
				profit += prices[high - 1] - prices[low];
			}
		}
		return profit;
	}
}