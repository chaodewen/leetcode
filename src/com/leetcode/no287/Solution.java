package com.leetcode.no287;

public class Solution {
	public int findDuplicate(int[] nums) {
		int len = nums.length;
		int low = 1, high = len - 1;
		int mid, cnt;
		while(high > low) {
			mid = low + (high - low) / 2;
			cnt = 0;
			for(int i = 0; i < len; i ++) {
				if(nums[i] <= mid) {
					cnt ++;
				}
			}
			if(cnt > mid) {
				high = mid;
			}
			else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().findDuplicate(new int[]{8, 3, 2, 4, 3, 7, 6, 1, 5}));
	}
}