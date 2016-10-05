package com.leetcode.no219;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dewayne on 2016/10/5.
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++)
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            else
                map.put(nums[i], i);
        return false;
    }
}