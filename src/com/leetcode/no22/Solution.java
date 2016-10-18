package com.leetcode.no22;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class Solution {
//	public List<String> generateParenthesis(int n) {
//		List<String> list = new ArrayList<String>();
//		if(n == 0) {
//			return list;
//		}
//		else if(n == 1) {
//			list.add("()");
//			return list;
//		}
//		else {
//			Set<String> ret = new HashSet<String>();
//			List<String> temp = generateParenthesis(n - 1);
//			for(int k = 0; k < temp.size(); k ++) {
//				String str = temp.get(k);
//				int len = str.length();
//				ret.add(str + "()");
//				for(int i = 0; i < len; i ++) {
//					StringBuffer sb = new StringBuffer(str);
//					sb.insert(i, "(");
//					int cnt = 0;
//					for(int j = i + 1; j <= len; j ++) {
//						if(j != i) {
//							if(cnt == 0) {
//								sb.insert(j, ")");
//								ret.add(sb.toString());
//								sb.deleteCharAt(j);
//							}
//						}
//						if(j < len) {
//							if(sb.charAt(j) == '(') {
//								cnt ++;
//							}
//							else {
//								cnt --;
//							}
//						}
//					}
//					sb.deleteCharAt(i);
//				}
//			}
//			list.addAll(ret);
//			return list;
//		}
//	}
	List<String> list = new ArrayList<>();
	public List<String> generateParenthesis(int n) {
		generate(n, n, "");
		return list;
	}
	private void generate(int left, int right, String str) {
		if(left == 0 && right == 0) {
			list.add(str);
			return;
		}
		if(left > 0)
			generate(left - 1, right, str + "(");
		if(right > 0 && right > left)
			generate(left, right - 1, str + ")");
	}
	public static void main(String[] args) {
		System.out.println(new Solution().generateParenthesis(2));
	}
}