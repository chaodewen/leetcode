package com.leetcode.no119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i < rowIndex + 1; i ++)
        	list.add((int) (((long)list.get(i - 1) * (rowIndex - i + 1)) / i));
        return list;
    }
}