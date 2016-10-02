package com.leetcode.no153;

public class Solution {
	public int findMin(int[] nums) {
		int len = nums.length;
		int low = 0, high = len - 1, mid;
		while(low < high) {
			mid = (high + low) / 2;
			if(nums[mid] < nums[0]) {
				high = mid;
			}
			else {
				low = mid + 1;
			}
		}
		return Math.min(nums[0], nums[high]);
	}
}