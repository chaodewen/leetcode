package com.leetcode.no349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i : nums1) {
        	set.add(i);
        }
        for(int i : nums2) {
        	if(set.contains(i)) {
        		result.add(i);
        	}
        }
        int cnt = 0;
        int[] ret = new int[result.size()];
        for(int i : result) {
        	ret[cnt ++] = i;
        }
        return ret;
    }
}