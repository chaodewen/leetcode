package com.leetcode.no75;

public class Solution {
	public void sortColors(int[] nums) {
		int n0 = 0, n1 = 0, n2 = nums.length, temp;
		while(n1 < n2) {
			switch(nums[n1]) {
			case 0:
				// n1指向0时跟指向从左向右第一个1的n0换内容
				temp = nums[n0];
				nums[n0] = nums[n1];
				nums[n1] = temp;
				n0 ++;
				n1 ++;
				break;
			case 1:
				// n1指向1时不用交换
				n1 ++;
				break;
			case 2:
				// n1指向2时跟指向从右向左第一个非2值的n2换
				n2 --;
				temp = nums[n1];
				nums[n1] = nums[n2];
				nums[n2] = temp;
			}
		}
	}
}