package com.leetcode.no46;

import java.util.ArrayList;
import java.util.List;

// public class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         return doPermutations(nums, nums.length);
//     }
//     private List<List<Integer>> doPermutations(int[] nums, int len) {
//     	List<List<Integer>> lists = new ArrayList<List<Integer>>();
//     	if(len == 0)
//     		return lists;
//     	if(len == 1) {
//     		for(int num : nums) {
//     			List<Integer> list = new ArrayList<>();
//     			list.add(num);
//     			lists.add(list);
//     		}
//     		return lists;
//     	}
//     	for(int i = 0; i < nums.length; i ++) {
//     		List<List<Integer>> tempLists = doPermutations(nums, len - 1);
//     		for(List<Integer> list : tempLists)
//     			if(!list.contains(nums[i])) {
//     				list.add(nums[i]);
//     				lists.add(list);
//     			}
//     	}
//     	return lists;
//     }
// }

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		backtrack(lists, new ArrayList<>(), nums);
		return lists;
	}
	private void backtrack(List<List<Integer>> lists, List<Integer> tempList, int[] nums) {
		if(tempList.size() == nums.length)
			lists.add(new ArrayList<>(tempList));
		else {
			for(int i = 0; i < nums.length; i ++)
				if(!tempList.contains(nums[i])) {
					tempList.add(nums[i]);
					backtrack(lists, tempList, nums);
					tempList.remove(tempList.size() - 1);
				}
		}
	}
}