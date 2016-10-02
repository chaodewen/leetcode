package com.leetcode.no171;

public class Solution {
	public int titleToNumber(String s) {
		char[] chars = new StringBuffer(s).reverse().toString().toCharArray();
		int i = 0;
		int ret = 0;
		for(char c : chars) {
			ret += ((int) (c - 'A') + 1) * ((int) Math.pow(26, i ++));
		}
		return ret;
	}
}