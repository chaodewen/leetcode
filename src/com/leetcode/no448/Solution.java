package com.leetcode.no448;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cc on 2017/2/18.
 */

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // 用负号标记是否出现过这个数
        for(int i = 0; i < nums.length; i ++)
            if(nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];

        // 此时为正值的位置肯定没有对应的数，可以加入答案
        for(int i = 0; i < nums.length; i ++)
            if(nums[i] > 0)
                list.add(i + 1);

        return list;
    }
}