package com.leetcode.no350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i ++)
        	if(map.containsKey(nums1[i]))
        		map.replace(nums1[i], map.get(nums1[i]) + 1);
        	else
        		map.put(nums1[i], 1);
        for(int i = 0; i < nums2.length; i ++)
        	if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
        		list.add(nums2[i]);
        		map.replace(nums2[i], map.get(nums2[i]) - 1);
        	}
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i ++)
        	ret[i] = list.get(i);
        return ret;
    }
}