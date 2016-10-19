package com.leetcode.no152;

/**
 * Created by Dewayne on 2016/10/19.
 */

public class Solution {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2];
        if(nums[0] > 0)
            dp[0][0] = nums[0];
        else
            dp[0][1] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] == 0) {
                dp[i][0] = 0;
                dp[i][1] = 0;
            }
            else if(nums[i] > 0) {
                if(dp[i - 1][0] == 0)
                    dp[i][0] = nums[i];
                else
                    dp[i][0] = nums[i] * dp[i - 1][0];
                if(dp[i - 1][1] != 0)
                    dp[i][1] = nums[i] * dp[i - 1][1];
            }
            else {
                if(dp[i - 1][0] == 0)
                    dp[i][1] = nums[i];
                else
                    dp[i][1] = nums[i] * dp[i - 1][0];
                if(dp[i - 1][1] == 0)
                    dp[i][1] = Math.min(nums[i], dp[i][1]);
                else
                    dp[i][0] = nums[i] * dp[i - 1][1];

            }
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}