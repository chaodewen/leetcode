package com.leetcode.no238;

public class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		for(int i = 1; i < nums.length; i ++) {
			if(i == 1)
				output[i] = nums[i - 1];
			else
				output[i] = nums[i - 1] * output[i - 1];
		}
		for(int i = nums.length - 2; i >= 0; i --) {
			if(i == 0)
				output[i] = nums[i + 1];
			else {
				output[i] *= nums[i + 1];
				nums[i] *= nums[i + 1];
			}
		}
		return output;
	}
}