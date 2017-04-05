package com.leetcode.no189;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    // lintcode类似题
    // public void rotateString(char[] str, int offset) {
    // 	if(str.length > 0)
    // 		for(int i = 0; i < offset; i ++) {
    //      	char last = str[str.length - 1];
    //      	for(int j = str.length - 1; j > 0; j --)
    //      		str[j] = str[j - 1];
    //      	str[0] = last;
    //      }
    // }

    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k % nums.length - 1);
        reverse(nums, k % nums.length, nums.length - 1);
    }
    private void reverse(int[] nums, int low, int high) {
        while(low < high) {
            int temp = nums[low];
            nums[low ++] = nums[high];
            nums[high --] = temp;
        }
    }
}