package com.leetcode.no154;

public class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;

        while(high > 0 && nums[0] == nums[high])
            high --;

        while(low <= high) {
            mid = low + (high - low) / 2;
            if(nums[mid] > nums[high])
                low ++;
            else
                high --;
        }

        return nums[mid];
    }
}