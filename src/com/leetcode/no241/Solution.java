package com.leetcode.no241;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<>();
        if(input == null || input.equals(""))
            return list;
        if(!input.contains("+") && !input.contains("-") && !input.contains("*")) {
            list.add(Integer.valueOf(input));
            return list;
        }
        for(int i = 0; i < input.length(); i ++)
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
                for(int lnum : left)
                    for(int rnum : right)
                        if(input.charAt(i) == '+')
                            list.add(lnum + rnum);
                        else if(input.charAt(i) == '-')
                            list.add(lnum - rnum);
                        else
                            list.add(lnum * rnum);
            }
        return list;
    }
}