package com.leetcode.no128;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int max = 0;
        for(int num : nums)
        	if(!map.containsKey(num)) {
        		int left = map.containsKey(num - 1) ? map.get(num - 1) : 0;
        		int right = map.containsKey(num + 1) ? map.get(num + 1) : 0;
        		int now = left + right + 1;
        		map.put(num, now);
        		map.replace(num - left, now);
        		map.replace(num + right, now);
        		max = Math.max(now, max);
        	}
        return max;
    }
}