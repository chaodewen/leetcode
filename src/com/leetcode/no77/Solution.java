package com.leetcode.no77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	boolean rec[];
	List<List<Integer>> ret;
	private void search(int start, int cnt, int n, int k) {
		for(int i = start; i < n; i ++) {
			if(cnt + 1 == k) {
				rec[i] = true;
				List<Integer> list = new ArrayList<Integer>();
				for(int j = 0; j <= i; j ++) {
					if(rec[j]) {
						list.add(j + 1);
					}
				}
				ret.add(list);
				rec[i] = false;
			}
			else {
				rec[i] = true;
				search(i + 1, cnt + 1, n, k);
				rec[i] = false;
			}
		}
	}
	public List<List<Integer>> combine(int n, int k) {
		rec = new boolean[n];
		ret = new ArrayList<List<Integer>>();
		if(k != 0) {
			search(0, 0, n, k);
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().combine(2, 2));
	}
}