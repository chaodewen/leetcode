package com.leetcode.no377;

public class Solution {
    // 再创建一个递归函数，记录函数的返回值还是会超时
    public int combinationSum4(int[] nums, int target) {
    	int[] dp = new int[target + 1];
    	for(int i = 1; i < dp.length; i ++)
    		for(int num : nums)
    			if(num == i)
    				dp[i] ++;
    			else if(num < i)
    				dp[i] += dp[i - num];
    	return dp[target];
    }
}