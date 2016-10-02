package com.leetcode.no283;

public class Solution {
	public void moveZeroes(int[] nums) {
		int zeroLen = 0;
		int temp;
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] == 0) {
				zeroLen ++;
			}
			else {
				temp = nums[i];
				nums[i] = 0;
				nums[i - zeroLen] = temp;
			}
		}
	}
	public static void main(String[] args) {
//		int[] nums = {0, 1, 0, 0, 3, 12};
		int[] nums = {0};
		for(int i = 0; i < nums.length; i ++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		new Solution().moveZeroes(nums);
		
		for(int i = 0; i < nums.length; i ++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}