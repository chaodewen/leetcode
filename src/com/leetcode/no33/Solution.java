package com.leetcode.no33;

public class Solution {
	public int search(int[] nums, int target) {
		int len = nums.length, low = 0, high = len - 1;
		while(low <= high) {
			int pos = (low + high) / 2;
			if(nums[pos] == target)
				return pos;
			else if(nums[pos] >= nums[low]) {
				if(target >= nums[low] && target < nums[pos])
					high = pos - 1;
				else
					low = pos + 1;
			}
			else {
				if(target <= nums[high] && target > nums[pos])
					low = pos + 1;
				else
					high = pos - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[] { 4, 5, 5, 5, 6, 7, 7, 0, 1, 2, 2, 2 };
		System.out.println(s.search(nums, 7));
	}
}