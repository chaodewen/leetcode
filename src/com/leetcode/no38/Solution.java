package com.leetcode.no38;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> list = new ArrayList<>();
    public String countAndSay(int n) {
        list = new ArrayList<>();
        list.add("1");
        return solve(n);
    }
    private String solve(int n) {
        if(n <= list.size())
            return list.get(n - 1);
        if(n != list.size() + 1)
            solve(n - 1);
        String last = list.get(n - 2), ans = "";
        for(int i = 0; i < last.length(); i ++) {
            int cnt = 1, j = i + 1;
            while(j < last.length() && last.charAt(j) == last.charAt(j - 1)) {
                j ++;
                cnt ++;
            }
            i = j - 1;
            ans += String.valueOf(cnt) + last.charAt(i);
        }
        list.add(ans);
        return ans;
    }
}