package com.leetcode.no34;

/**
 * Created by Cc on 2017/8/19.
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
    private int[] search(int[] nums, int low, int high, int target) {
        if(low > high)
            return new int[] {-1, -1};

        int mid = low + (high - low) / 2;

        if(nums[mid] == target) {
            int[] left = search(nums, low, mid - 1, target);
            int[] right = search(nums, mid + 1, high, target);

            return new int[] {left[0] == -1 ? mid : left[0], right[1] == -1 ? mid : right[1]};
        }
        else if(nums[mid] < target)
            return search(nums, mid + 1, high, target);
        else
            return search(nums, low, mid - 1, target);
    }
}