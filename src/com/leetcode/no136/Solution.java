package com.leetcode.no136;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class Solution {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i ++)
			result ^= nums[i];
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Solution solution = new Solution();
		int len;
		while(in.hasNext()) {
			len = in.nextInt();
			int[] nums = new int[len];
			for(int i = 0; i < len; i ++) {
				nums[i] = in.nextInt();
			}
			System.out.println(solution.singleNumber(nums));
		}
		in.close();
	}
}
