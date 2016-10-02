package com.leetcode.no35;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		int index;
		int lastHighIndex = -1;
		
		while(high >= low) {
			index = low + (high - low) / 2;
			if(nums[index] == target) {
				return index;
			}
			else if(nums[index] > target) {
				lastHighIndex = index;
				high = index - 1;
			}
			else {
				low = index + 1;
			}
		}
		if(lastHighIndex == -1) {
			return nums.length;
		}
		else {
			return lastHighIndex;
		}
	}
}