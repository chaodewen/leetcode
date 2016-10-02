package com.leetcode.no13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static Map<Character, Integer> roman = new HashMap<Character, Integer>();
	public int romanToInt(String s) {
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		int len = s.length();
		int[] exp = new int[len];
		char[] ss = s.toCharArray();
		for(int i = 0; i < len; i ++) {
			exp[i] = roman.get(ss[i]);
		}
		int ret = 0;
		for(int i = len - 1; i > 0; i --) {
			if(Math.abs(exp[i]) > exp[i - 1]) {
				exp[i - 1] = - exp[i - 1];
			}
			ret += exp[i];
		}
		return ret + exp[0];
	}
}