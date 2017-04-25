package com.leetcode.no33;

public class Solution {
	public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while(low <= high) {
			int mid = (high - low) / 2 + low;
			if(nums[mid] == target)
				return mid;
			else if(nums[mid] >= nums[0]) {
				if(nums[mid] > target && target >= nums[0])
					high = mid - 1;
				else
					low = mid + 1;
			}
			else {
				if(nums[mid] < target && target <= nums[nums.length - 1])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}
}