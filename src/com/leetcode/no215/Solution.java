package com.leetcode.no215;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickFind(nums, k, 0, nums.length - 1);
    }
    private int quickFind(int[] nums, int k, int start, int end) {
        int pivot = nums[end], left = start;
        // 换至pivot左边全都比pivot小
        for(int i = start; i < end; i ++)
            if(nums[i] <= pivot)
                swap(nums, i, left ++);
        swap(nums, end, left);

        if(left + k == nums.length)
            return nums[left];
        else if(left + k < nums.length)
            return quickFind(nums, k, left + 1, end);
        else
            return quickFind(nums, k, start, left - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}