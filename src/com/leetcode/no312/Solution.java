package com.leetcode.no312;

public class Solution {
	public int maxCoins(int[] nums) {
		int len = nums.length;
		if(len == 0) {
			return 0;
		}
		else {
			// 捏爆[i, j)的气球时硬币最大值，右边开区间可以避免k循环中计算左边和右边coins时越界
			int[][] coins = new int[len + 1][len + 1];
			// 先确定右边界j是从1到len
			for(int j = 1; j <= len; j ++) {
				// 再确定左边界i是从j - 1到0
				for(int i = j - 1; i >= 0; i --) {
					int max = 0;
					// k代表[i, j)间最后一个捏爆的气球
					for(int k = i; k <= j - 1; k ++) {
						int kLastBurst = coins[i][k] + coins[k + 1][j] + nums[k] 
								* (i == 0 ? 1 : nums[i - 1]) * (j == len ? 1 : nums[j]);
						max = Math.max(max, kLastBurst);
					}
					coins[i][j] = max;
				}
			}
			return coins[0][len];
		}
	}
}