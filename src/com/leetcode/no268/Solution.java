package com.leetcode.no268;

public class Solution {
	public int missingNumber(int[] nums) {
		int ret = nums.length;
		for(int i = 0; i < nums.length; i ++) {
			ret += i - nums[i];
		}
		return ret;
	}
}