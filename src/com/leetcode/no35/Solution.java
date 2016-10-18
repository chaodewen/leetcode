package com.leetcode.no35;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1, index, lastHighIndex = -1;
		while(low <= high) {
			index = low + (high - low) / 2;
			if(nums[index] == target)
				return index;
			else if(nums[index] > target) {
				lastHighIndex = index;
				high = index - 1;
			}
			else
				low = index + 1;
		}
		return lastHighIndex == -1 ? nums.length : lastHighIndex;
	}
}