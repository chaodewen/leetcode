package com.leetcode.no72;

public class Solution {
	public int minDistance(String str1, String str2) {
		if(str1.isEmpty() || str2.isEmpty())
			return str1.length() + str2.length();

		int[][] dp = new int[str1.length() + 1][str2.length() + 1];

		for(int i = 0; i <= str1.length(); i ++)
			dp[i][0] = i;

		for(int j = 0; j <= str2.length(); j ++)
			dp[0][j] = j;

		for(int i = 1; i <= str1.length(); i ++)
			for(int j = 1; j <= str2.length(); j ++) {
				// case1为dp[i - 1][j - 1]变为dp[i][j]的情况
				int case1 = str1.charAt(i - 1) == str2.charAt(j - 1) ? dp[i - 1][j - 1] : (dp[i - 1][j - 1] + 1);
				// case2为dp[i - 1][j]或dp[i][j - 1]变为dp[i][j]的情况
				int case2 = (dp[i - 1][j] < dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1]) + 1;
				dp[i][j] = Math.min(case1, case2);
			}

		return dp[str1.length()][str2.length()];
	}
}