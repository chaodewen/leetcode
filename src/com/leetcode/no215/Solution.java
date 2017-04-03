package com.leetcode.no215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSearch(nums, 0, nums.length - 1, k);
    }
    private int quickSearch(int nums[], int left, int right, int k) {
        int i = left, key = nums[right];

        for(int j = left; j < right; j ++)
            if(nums[j] < key)
                swap(nums, i ++, j);

        swap(nums, i, right);

        if(right + 1 - i == k)
            return nums[i];
        else if(right + 1 - i > k)
            return quickSearch(nums, i + 1, right, k);
        else
            return quickSearch(nums, left, i - 1, k - (right + 1 - i));
    }
    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}