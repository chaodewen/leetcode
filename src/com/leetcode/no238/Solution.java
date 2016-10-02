package com.leetcode.no238;

public class Solution {
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] output = new int[len];
		int temp = 1;
		output[0] = 1;
		for(int i = 1; i < len; i ++) {
			output[i] = output[i - 1] * nums[i - 1];
		}
		for(int i = len - 1; i >= 0; i --) {
			output[i] = temp * output[i];
			temp *= nums[i];
		}
		return output;
	}
}