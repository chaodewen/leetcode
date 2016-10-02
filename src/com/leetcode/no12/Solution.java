package com.leetcode.no12;

public class Solution {
	String[] bits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
			, "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
			, "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
			, "", "M", "MM", "MMM"};
	public String intToRoman(int num) {
		StringBuffer sb = new StringBuffer();
		for(int digit = 1000, i = 3; i >= 0; digit /= 10, i --) {
			sb.append(bits[i * 10 + num / digit]);
			num -= (num / digit) * digit;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(new Solution().intToRoman(37));
	}
}