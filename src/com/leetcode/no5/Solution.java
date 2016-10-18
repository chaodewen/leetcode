package com.leetcode.no5;

public class Solution {
	public String longestPalindrome(String s) {
		int len = s.length(), maxi = 0, maxj = 0;
		boolean[][] dp = new boolean[len][len];
		for(int diff = 0; diff < len; diff ++)
			for(int i = 0; i + diff < len; i ++)
				if(s.charAt(i) == s.charAt(i + diff)) {
					if(diff == 0)
						dp[i][i] = true;
					else if(diff == 1 || dp[i + 1][i + diff - 1]) {
						// diff == 1时dp[i + 1][i + diff - 1] == dp[i + 1][i] 一定为false
						// 所以要单独考虑diff == 1
						dp[i][i + diff] = true;
						if(diff > maxj - maxi) {
							maxi = i;
							maxj = i + diff;
						}
					}
				}
		return s.substring(maxi, maxj + 1);
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.longestPalindrome("abcabcbb"));
	}
}