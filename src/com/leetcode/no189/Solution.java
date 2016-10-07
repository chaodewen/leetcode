package com.leetcode.no189;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k % nums.length - 1);
        reverse(nums, k % nums.length, nums.length - 1);
    }
    private void reverse(int[] nums, int i, int j) {
        int low = i, high = j;
        while(low < high) {
            int temp = nums[low];
            nums[low ++] = nums[high];
            nums[high --] = temp;
        }
    }
}