package com.leetcode.no279;

public class Solution {
	private int[] pnums;
	private int len;
	private int[] dp;
    public int numSquares(int n) {
    	pnums = new int[n + 1];
    	dp = new int[n + 1];
    	for(len = 1; len * len <= n; len ++)
    		pnums[len] = len * len;
        return cal(n);
    }
    private int cal(int n) {
    	if(dp[n] != 0)
    		return dp[n];
    	int min = Integer.MAX_VALUE;
    	for(int i = len - 1; i >= 1; i --) {
    		if(n == pnums[i])
    			return 1;
    		if(n % pnums[i] == 0 && min > n / pnums[i])
    			min = n / pnums[i];
    		int now = n - pnums[i];
    		if(now >= 0) {
	    		if(dp[now] != 0 && min > dp[now] + 1)
	    			min = dp[now] + 1;
	    		else {
	    			dp[now] = cal(now);
	    			if(dp[now] + 1 < min)
	    				min = dp[now] + 1;
	    		}
    		}
    	}
    	dp[n] = min;
    	return min;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.numSquares(13));
    }
}