package com.leetcode.no168;

public class Solution {
	public String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
		int temp;
		while(n > 0) {
			temp = n % 26;
			n /= 26;
			if(temp != 0) {
				sb.append((char)('A' + temp - 1));
			}
			else {
				sb.append('Z');
				n --;
			}
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(new Solution().convertToTitle(53));
	}
}