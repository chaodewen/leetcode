package com.leetcode.no345;

public class Solution {
	public boolean isVowels(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
	public String reverseVowels(String s) {
		int len = s.length(), i = 0, j = len - 1;
		StringBuilder sb = new StringBuilder(s);
		while(i < j) {
			boolean iVowel = isVowels(s.charAt(i));
			boolean jVowel = isVowels(s.charAt(j));
			if(iVowel && jVowel) {
				char temp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j, temp);
				i ++;
				j --;
			}
			else {
				if(!iVowel) {
					i ++;
				}
				if(!jVowel) {
					j --;
				}
			}
		}
		return sb.toString();
	}
}