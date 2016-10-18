package com.leetcode.no3;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int len = s.length(), max = 0;
		for(int i = 0; i < len ; i ++) {
			boolean[] hasChar = new boolean[200];
			int cnt = 0;
			for(int j = i; j < len; j ++) {
				if(hasChar[s.charAt(j) - ' '])
					break;
				else {
					hasChar[s.charAt(j) - ' '] = true;
					cnt ++;
				}
			}
			max = Math.max(max, cnt);
		}
		return max;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(s.lengthOfLongestSubstring("bbbbb"));
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));
	}
}