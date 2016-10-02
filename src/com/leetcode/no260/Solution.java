package com.leetcode.no260;

public class Solution {
	public int[] singleNumber(int[] nums) {
		int xor = 0;
		for(int num : nums) {
			xor ^= num;
		}
		// digit为xor第一个是1的位
		int digit = xor & (- xor);
		int[] rets = {0, 0};
		// 通过digit位是否为1将两个数
		for(int num : nums) {
			// 对划分出的两个集合分别异或得到结果
			if((num & digit) == 0) {
				rets[0] ^= num;
			}
			else {
				rets[1] ^= num;
			}
		}
		return rets;
	}
}