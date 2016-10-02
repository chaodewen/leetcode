package com.leetcode.no187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
		int len = s.length();
		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for(int i = 10; i <= len; i ++) {
			String temp = s.substring(i - 10, i);
			if(map.containsKey(temp)) {
				int cnt = map.get(temp);
				if(cnt == 1) {
					list.add(temp);
				}
				map.replace(temp, map.get(temp) + 1);
			}
			else {
				map.put(temp, 1);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.findRepeatedDnaSequences("AAAAAAAAAAA"));
	}
}