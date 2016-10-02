package com.leetcode.no137;

public class Solution {
	// 取数组所有数的第i位进行考虑，所有第i位的数相加结果对3取余，结果就是要找的数第i位的值
	public int singleNumber(int[] nums) {
		int ret = 0;
		// 诸位进行处理
		for(int i = 0; i < 32; i ++) {
			// mask是一个掩码数，但是它在i=31时值为-2147483648，可能导致val为负
			int cnt = 0, mask = 1 << i;
			for(int j = 0; j < nums.length; j ++) {
				int val = nums[j] & mask;
				// 此处val的值只要不是32位全0即正常的0就可以认为这一位应该是1
				// 不能只考虑val为正的情况，因为为负也代表这一位是1
				if(val != 0) {
					cnt ++;
				}
			}
			// 这里的3如果换成K即可解决集合中所有数出现K次，只有一个数出现一次的问题
			if(cnt % 3 > 0) {
				ret |= mask;
			}
		}
		return ret;
	}
}