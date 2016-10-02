package com.leetcode.no300;

public class Solution {
	// 一种超时的方法
//	boolean[] rec;
//	int len;
//	public int lengthOfLIS(int[] nums) {
//		len = nums.length;
//		rec = new boolean[len];
//		return find(0, nums);
//	}
//	private int find(int i, int[] nums) {
//		if(i >= len) {
//			boolean first = true;
//			int last = 0;
//			int cnt = 0;
//			for(int j = 0; j < len; j ++) {
//				if(rec[j]) {
//					if(first) {
//						cnt ++;
//						last = nums[j];
//						first = false;
//					}
//					else {
//						if(last <= nums[j]) {
//							cnt ++;
//							last = nums[j];
//						}
//						else if(last == nums[j]) {
//							continue;
//						}
//						else {
//							return 0;
//						}
//					}
//				}
//			}
//			return cnt;
//		}
//		else {
//			int yes = 0, no = 0;
//			no = find(i + 1, nums);
//			for(int j = 0; j < i; j ++) {
//				if(rec[j] && nums[j] >= nums[i]) {
//					return no;
//				}
//			}
//			rec[i] = true;
//			yes = find(i + 1, nums);
//			rec[i] = false;
//			return (yes > no) ? yes : no;
//		}
//	}
	public int lengthOfLIS(int[] nums) {
		int len = nums.length;
		if(len == 0) {
			return len;
		}
		else {
			int[] dp = new int[len];
			int max, ret = 1;
			dp[0] = 1;
			for(int i = 1; i < len; i ++) {
				max = 0;
				for(int j = 0; j < i; j ++) {
					if(nums[i] > nums[j] && max < dp[j]) {
						max = dp[j];
					}
				}
				dp[i] = max + 1;
				if(ret < dp[i]) {
					ret = dp[i];
				}
			}
			return ret;
		}
	}
	public static void main(String[] args) {
//		System.out.println(new Solution().lengthOfLIS(new int[]{-1,-2,-3,-4,-5,-6}));
//		System.out.println(new Solution().lengthOfLIS(new int[]{2, 2}));
		System.out.println(new Solution().lengthOfLIS(new int[]{1, 2, 3, 5}));
		System.out.println(new Solution().lengthOfLIS(new int[]{}));
	}
}