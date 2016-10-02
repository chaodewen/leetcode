package com.leetcode.no72;

public class Solution {
	public int minDistance(String str1, String str2) {
		if(str1.isEmpty() || str2.isEmpty()) {
			return str1.length() + str2.length();
		}
		else {
			int len1 = str1.length(), len2 = str2.length();
			// dp[i][j]代表word1前i个到word2前j个的最小编辑距离
			int[][] dp = new int[len1 + 1][len2 + 1];
			for(int i = 0; i <= len1; i ++) {
				dp[i][0] = i;
			}
			for(int j = 0; j <= len2; j ++) {
				dp[0][j] = j;
			}
			for(int i = 1; i <= len1; i++) {
				for(int j = 1; j <= len2; j ++) {
					// 包括了所有生成dp[i][j]的情况
					int case1, case2;
					// case1为dp[i - 1][j - 1]变为dp[i][j]的情况
					if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
						case1 = dp[i - 1][j - 1];
					}
					else {
						case1 = dp[i - 1][j - 1] + 1;
					}
					// case2为dp[i - 1][j]或dp[i][j - 1]变为dp[i][j]的情况
					case2 = (dp[i][j - 1] 
							> dp[i - 1][j] ? dp[i - 1][j] : dp[i][j - 1]) + 1;
					// 取两种情况的最小值
					dp[i][j] = case1 < case2 ? case1 : case2;
				}
			}
			return dp[len1][len2];
		}
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		String word1 = "a";
		String word2 = "a";
		System.out.println(solution.minDistance(word1, word2));
	}
}
