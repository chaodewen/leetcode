package com.leetcode.no27;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int cnt = 0, last = nums.length - 1;
		for(int i = 0; i <= last; i ++) {
			if(nums[i] != val) {
				nums[cnt++] = nums[i];
			}
		}
		return cnt;
	}
}