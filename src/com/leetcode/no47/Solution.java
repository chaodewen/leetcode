package com.leetcode.no47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dewayne on 2016/10/19.
 */

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(lists, new ArrayList<>(), nums, new boolean[nums.length]);
        return lists;
    }
    private void backtrack(List<List<Integer>> lists, List<Integer> tempList
            , int[] nums, boolean[] used) {
        if(tempList.size() == nums.length)
            lists.add(new ArrayList<>(tempList));
        else {
            for(int i = 0; i < nums.length; i ++)
                if(!used[i] && !(i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    tempList.add(nums[i]);
                    used[i] = true;
                    backtrack(lists, tempList, nums, used);
                    used[i] = false;
                    tempList.remove(tempList.size() - 1);
                }
        }
    }
}