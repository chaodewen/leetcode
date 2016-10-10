package com.leetcode.no416;

/**
 * Created by Dewayne on 2016/10/10.
 */

public class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2) return false;
        int sum = 0;
        for(int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        if(sum % 2 == 0)
            sum /= 2;
        else
            return false;
        boolean[] rec = new boolean[nums.length];
        if(search(nums, rec, sum)) {
            for(int i = 0; i < nums.length; i ++)
                if(rec[i])
                    sum -= nums[i];
            return sum == 0;
        }
        return false;
    }
    private boolean search(int[] nums, boolean[] rec, int target) {
        for(int i = 0; i < nums.length; i ++)
            if(!rec[i] && nums[i] <= target) {
                rec[i] = true;
                if(target == nums[i])
                    return true;
                else if(search(nums, rec, target - nums[i]))
                    return true;
                rec[i] = false;
            }
        return false;
    }
}