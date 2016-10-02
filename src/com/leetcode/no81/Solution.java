package com.leetcode.no81;

public class Solution {
	public boolean search(int[] nums, int target) {
		int len = nums.length, low = 0, high = len - 1;
		while(low <= high) {
			int pos = (low + high) / 2;
			if(nums[pos] == target) {
				return true;
			}
			else if(nums[pos] == nums[low]) {
				// 核心就这一句
				low ++;
			}
			else if(nums[pos] >= nums[low]) {
				if(target >= nums[low] && target < nums[pos]) {
					high = pos - 1;
				}
				else {
					low = pos + 1;
				}
			}
			else {
				if(target <= nums[high] && target > nums[pos]) {
					low = pos + 1;
				}
				else {
					high = pos - 1;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[] { 1, 3, 1, 1, 1 };
		System.out.println(s.search(nums, 3));
	}
}