package com.leetcode.no53;

public class Solution {
	// public int maxSubArray(int[] nums) {
	//     // write your code
	//     int sum = nums[0], max = nums[0];
	//     boolean restart = false;

	//     for(int i = 1; i < nums.length; i ++) {
	//     	if(restart) {
	//     		sum = nums[i];
	//     		restart = false;
	//     	}
	//     	else {
	//     		if(sum + nums[i] < 0) {
	//     			restart = true;
	//     		}
	//     		else {
	//     			sum = (sum + nums[i] > nums[i]) ? (sum + nums[i]) : nums[i];
	//     		}
	//     	}

	//     	max = sum > max ? sum : max;
	//     }

	//     return max;
	// }

	public int maxSubArray(int[] nums) {
		int max = nums[0], last = nums[0];

		for(int i = 1; i < nums.length; i ++) {
			last = (last > 0) ? (last + nums[i]) : nums[i];
			max = max > last ? max : last;
		}

		return max;
	}
}