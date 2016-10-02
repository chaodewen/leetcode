package com.leetcode.no6;

public class Solution {
	public String convert(String s, int numRows) {
		if(numRows <= 1) {
			return s;
		}
		int len = s.length(), step = 2 * numRows - 2;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numRows; i ++) {
			for(int j = i; j < len; j += step) {
				sb.append(s.charAt(j));
				if(i != 0 && i != numRows - 1 && j + step - 2 * i < len) {
					sb.append(s.charAt(j + step - 2 * i));
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.convert("PAYPALISHIRING", 3));
	}
}