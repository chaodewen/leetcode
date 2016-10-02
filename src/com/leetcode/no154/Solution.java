package com.leetcode.no154;

public class Solution {
	public int findMin(int[] nums) {
		int low = 0, high = nums.length - 1, mid;
		while(high > 0 && nums[0] == nums[high]) {
			high --;
		}
		while(high > low) {
			mid = (high + low) / 2;
			if(nums[mid] >= nums[0]) {
				low = mid + 1;
			}
			else {
				high = mid;
			}
		}
		return Math.min(nums[high], nums[0]);
	}
	public static void main(String[] args) {
		int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
		System.out.println(new Solution().findMin(nums));
	}
}