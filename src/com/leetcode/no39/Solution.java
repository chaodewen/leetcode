package com.leetcode.no39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dewayne on 2016/10/18.
 */

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return backtrack(candidates, target, 0);
    }
    private List<List<Integer>> backtrack(int[] candidates, int target, int start) {
        List<List<Integer>> ret = new ArrayList<>();
        if(candidates.length == 0 || target < candidates[0])
            return ret;
        for(int i = start; i < candidates.length; i ++) {
            if(candidates[i] == target) {
                List<Integer> elem = new ArrayList<>();
                elem.add(candidates[i]);
                ret.add(elem);
            }
            List<List<Integer>> list = backtrack(candidates, target - candidates[i], i);
            for(int j = 0; j < list.size(); j ++)
                list.get(j).add(candidates[i]);
            if(list.size() > 0) ret.addAll(list);
        }
        return ret;
    }
}