package com.leetcode.no46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		return doPermutation(nums, nums.length);
	}
	private List<List<Integer>> doPermutation(int[] nums, int len) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		if(len == 1) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(nums[0]);
			lists.add(list);
		}
		else if(len == 2) {
			List<Integer> list1 = new ArrayList<Integer>();
			list1.add(nums[0]);
			list1.add(nums[1]);
			lists.add(list1);
			List<Integer> list2 = new ArrayList<Integer>();
			list2.add(nums[1]);
			list2.add(nums[0]);
			lists.add(list2);
		}
		else {
			int temp;
			for(int i = 0; i < len; i ++) {
				temp = nums[i];
				nums[i] = nums[len - 1];
				nums[len - 1] = temp;
				List<List<Integer>> tempList = new ArrayList<List<Integer>>();
				tempList = doPermutation(nums, len - 1);
				for(List<Integer> list : tempList) {
					list.add(nums[len - 1]);
				}
				lists.addAll(tempList);
				temp = nums[i];
				nums[i] = nums[len - 1];
				nums[len - 1] = temp;
			}
		}
		return lists;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().permute(new int[]{1, 2, 3}));
//		System.out.println(new Solution().permute(new int[]{1, 2}));
	}
}