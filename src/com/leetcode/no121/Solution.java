package com.leetcode.no121;

public class Solution {
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if(len < 2) {
			return 0;
		}
		else {
			int[] maxPro = new int[len];
			int[] buyPoint = new int[len];
			maxPro[0] = 0;
			buyPoint[0] = 0;
			int differ;
			for(int i = 1; i < len; i ++) {
				if(prices[i] > prices[buyPoint[i - 1]]) {
					differ = prices[i] - prices[buyPoint[i - 1]];
					if(differ > maxPro[i - 1]) {
						maxPro[i] = differ;
					}
					else {
						maxPro[i] = maxPro[i - 1];
					}
					buyPoint[i] = buyPoint[i - 1];
				}
				else {
					buyPoint[i] = i;
					maxPro[i] = maxPro[i - 1];
				}
			}
			int max = 0;
			for(int i = 0; i < len; i ++) {
				if(max < maxPro[i]) {
					max = maxPro[i];
				}
			}
			return max;
		}
	}
	public static void main(String[] args) {
//		int prices[] = {2, 1, 4};
		int prices[] = {1, 3, 4, 2, 3, 5, 4, 5};
		System.out.println(new Solution().maxProfit(prices));
	}
}