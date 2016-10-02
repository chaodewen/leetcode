package com.leetcode.no60;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String getPermutation(int n, int k) {
		List<String> list = new ArrayList<>();
		backtrack(list, new StringBuilder(), n);
		return list.get(k - 1);
	}
	private void backtrack(List<String> list, StringBuilder sb, int n) {
		if(sb.length() == n) {
			list.add(sb.toString());
		}
		else {
			for(int i = 1; i <= n; i ++) {
				if(sb.indexOf(String.valueOf(i)) == -1) {
					sb.append(i);
					backtrack(list, sb, n);
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.getPermutation(3, 1));
		System.out.println(s.getPermutation(3, 2));
		System.out.println(s.getPermutation(3, 3));
		System.out.println(s.getPermutation(3, 4));
		System.out.println(s.getPermutation(3, 5));
		System.out.println(s.getPermutation(3, 6));
	}
}