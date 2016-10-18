package com.leetcode.no6;

public class Solution {
	public String convert(String s, int numRows) {
		if(numRows <= 1) return s;
		int len = s.length(), step = 2 * numRows - 2;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numRows; i ++)
			for(int j = i; j < len; j += step) {
				sb.append(s.charAt(j));
				if(i != 0 && i != numRows - 1 && j + step - 2 * i < len)
					sb.append(s.charAt(j + step - 2 * i));
			}
		return sb.toString();
	}
}

//public class Solution {
//	public String convert(String s, int numRows) {
//		if(numRows <= 1) return s;
//		int div = 2 * numRows - 2, len = s.length();
//		int divNum = s.length() < div ? (s.length() == 0 ? 0 : 1) : (s.length() / div + 1);
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < numRows; i ++)
//			for(int j = 0; j < divNum; j ++) {
//				int index = j * div + i;
//				if(index < len)
//					sb.append(s.charAt(index));
//				int adjacent = j * div + 2 * numRows - 2 - i;
//				if(i != 0 && i != numRows - 1 && adjacent < s.length())
//					sb.append(s.charAt(adjacent));
//			}
//		return sb.toString();
//	}
//}