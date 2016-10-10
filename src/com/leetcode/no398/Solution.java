package com.leetcode.no398;

import java.util.*;

/**
 * Created by Dewayne on 2016/10/10.
 */

public class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();

    public Solution(int[] nums) {
        for(int i = 0; i < nums.length; i ++)
            if(map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get((new Random()).nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */