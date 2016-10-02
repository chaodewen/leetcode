package com.leetcode.no162;

public class Solution {
	public int findPeakElement(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
		else {
			int len = nums.length, low = 0, high = len - 1, mid;
			while(true) {
				mid = (low + high) / 2;
				if(mid == 0 && nums[mid] > nums[mid + 1] 
						|| mid == len - 1 && nums[mid] > nums[mid - 1] 
						|| nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
					return mid;
				}
				else if(nums[mid] > nums[mid + 1]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] data = new int[]{1};
		System.out.println(new Solution().findPeakElement(data));
	}
}