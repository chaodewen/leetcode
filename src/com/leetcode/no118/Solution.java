package com.leetcode.no118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows == 0)
            return ret;
        for(int i = 1; i <= numRows; i ++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j ++)
                if(j == 0 || j == i - 1)
                    list.add(1);
                else
                    list.add(ret.get(i - 2).get(j - 1) + ret.get(i - 2).get(j + 1));
            ret.add(list);
        }
        return ret;
    }
}