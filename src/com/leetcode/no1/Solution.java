package com.leetcode.no1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dewayne on 2016/10/4.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        for(int i = 0; i < nums.length; i ++)
            if(map.containsKey(target - nums[i])) {
                result = new int[] { map.get(target - nums[i]), i };
                break;
            }
            else
                map.put(nums[i], i);
        return result;
    }
}