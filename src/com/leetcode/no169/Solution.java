package com.leetcode.no169;

public class Solution {
	// Moore Voting Algorithm
	// 遍历数组，出现不同的将两数删除，相同则继续，最终剩下的就是结果
	public int majorityElement(int[] nums) {
		int cur = -1;
		int cnt = 0;
		for(int num : nums) {
			if(cnt == 0) {
				cur = num;
				cnt ++;
			}
			else if(cur == num) {
				cnt ++;
			}
			else {
				cnt --;
			}
		}
		return cur;
	}
}