package com.leetcode.no96;

public class Solution {
	public int numTrees(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			// dp[]代表i个节点的不同二叉树个数
			// 设置没有节点时为dp为1
			int[] dp = new int[n + 1];
			dp[0] = 1;
			for(int i = 1; i <= n; i ++) {
				// 把j作为左子节点个数，i-j-1即右子节点个数
				for(int j = 0; j < i; j ++) {
					dp[i] += dp[j] * dp[i - j - 1];
				}
			}
			return dp[n];
		}
	}
}