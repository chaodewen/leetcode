package com.leetcode.no216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//	public List<List<Integer>> comb(int low, int k, int n) {
//		List<List<Integer>> ret = new ArrayList<List<Integer>>();
//		if(k == 1 && n <= 9) {
//			if(low <= n) {
//				List<Integer> temp = new ArrayList<Integer>();
//				temp.add(n);
//				ret.add(temp);
//			}
//		}
//		else if(k > 1) {
//			for(int i = low; i <= 9; i ++) {
//				List<List<Integer>> lists = comb(i + 1, k - 1, n - i);
//				for(List<Integer> list : lists) {
//					List<Integer> temp = new ArrayList<Integer>();
//					temp.add(i);
//					temp.addAll(list);
//					ret.add(temp);
//				}
//			}
//		}
//		return ret;
//	}
//	public List<List<Integer>> combinationSum3(int k, int n) {
//		return comb(1, k, n);
//	}

	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> lists = new ArrayList<>();
		backtrack(lists, new ArrayList<>(), 1, n, k);
		return lists;
	}
	private void backtrack(List<List<Integer>> lists, List<Integer> tempList, int start, int remain, int k) {
		if(remain < 0) {
			return;
		}
		else if(remain == 0) {
			if(tempList.size() == k)
				lists.add(new ArrayList<>(tempList));
		}
		else {
			for(int i = start; i <= 9; i ++) {
				tempList.add(i);
				backtrack(lists, tempList, i + 1, remain - i, k);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.combinationSum3(3, 2));
		System.out.println(s.combinationSum3(3, 7));
		System.out.println(s.combinationSum3(3, 9));
		System.out.println(s.combinationSum3(2, 18));
	}
}