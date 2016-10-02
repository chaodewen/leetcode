package com.leetcode.no347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> ret = new ArrayList<Integer>();
		Map<Integer, Integer> times = new HashMap<Integer, Integer>();
		for(int i : nums) {
			times.put(i, times.getOrDefault(i, 0) + 1);
		}
		// 按大值在前排序，此处用到了Lambda表达式
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
				(key1, key2) -> key2.getValue() - key1.getValue());
		for(Map.Entry<Integer, Integer> entry : times.entrySet()) {
			pq.offer(entry);
		}
		// 取前k个数即为答案
		while(!pq.isEmpty() && ret.size() < k) {
			ret.add(pq.poll().getKey());
		}
		return ret;
	}
}