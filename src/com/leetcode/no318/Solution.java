package com.leetcode.no318;

public class Solution {
	public int maxProduct(String[] words) {
		int len = words.length, max = 0;
		// 1~26位各自代表words[i]中是否存在26个字母中的这一个
		int[] flag = new int[len];
		// 计算每个flag
		for(int i = 0; i < len; i ++) {
			char[] chars = words[i].toCharArray();
			for(char c : chars) {
				flag[i] |= ( 1 << (int) (c - 'a'));
			}
		}
		for(int i = 0; i < len; i ++) {
			for(int j = i + 1; j < len; j ++) {
				int multi = words[i].length() * words[j].length();
				if((flag[i] & flag[j]) == 0 && max < multi) {
					max = multi;
				}
			}
		}
		return max;
	}
}