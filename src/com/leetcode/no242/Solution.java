package com.leetcode.no242;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if(s.length() == t.length()) {
			char[] ss = s.toCharArray();
			char[] tt = t.toCharArray();
			Arrays.sort(ss);
			Arrays.sort(tt);
			System.out.println(ss);
			System.out.println(tt);
			return new String(ss).equals(new String(tt));
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		String s = "acbbac";
		String t = "baccab";
		System.out.println(new Solution().isAnagram(s, t));
	}
}