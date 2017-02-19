package com.leetcode.no442;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cc on 2017/2/19.
 */

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i ++) {
            int index = (nums[i] - 1) % nums.length;
            nums[index] += nums.length;
        }

        for(int i = 0; i < nums.length; i ++)
            if(nums[i] > nums.length * 2)
                list.add(i + 1);

        return list;
    }
}