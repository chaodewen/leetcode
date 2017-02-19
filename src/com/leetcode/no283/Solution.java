package com.leetcode.no283;

public class Solution {
//	public void moveZeroes(int[] nums) {
//		int zeroLen = 0;
//		int temp;
//		for(int i = 0; i < nums.length; i ++) {
//			if(nums[i] == 0) {
//				zeroLen ++;
//			}
//			else {
//				temp = nums[i];
//				nums[i] = 0;
//				nums[i - zeroLen] = temp;
//			}
//		}
//	}

	public void moveZeroes(int[] nums) {
		int idxZero = -1, idxNZero = -1;
		for(int i = 0; i < nums.length; i ++)
			if(nums[i] == 0) {
				idxZero = i;
				break;
			}
		for(int i = 0; i < nums.length; i ++)
			if(nums[i] != 0) {
				idxNZero = i;
				break;
			}
		if(idxZero == -1 || idxNZero == -1)
			return;
		while(idxNZero < nums.length && idxZero < nums.length) {
			if(nums[idxZero] != 0) {
				idxZero ++;
			}
			else if(nums[idxNZero] == 0 || idxNZero <= idxZero) {
				idxNZero ++;
			}
			else {
				nums[idxZero] = nums[idxNZero];
				nums[idxNZero] = 0;
				idxZero ++;
				idxNZero ++;
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