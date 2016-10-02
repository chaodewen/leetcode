package com.leetcode.no401;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        dfs(ans, num, 0, new int[2]);
        return ans;
    }
    private void dfs(List<String> ans, int num, int i, int[] hm) {
        if(num == 0 && hm[0] < 12 && hm[1] < 60) {
            ans.add(String.format("%d:%02d", hm[0], hm[1]));
            return;
        }
        if(i == 10)
            return;
        int idx = i < 4 ? 0 : 1;
        int val = 1 << (i < 4 ? i : (i - 4));
        hm[idx] += val;
        dfs(ans, num - 1, i + 1, hm);
        hm[idx] -= val;
        dfs(ans, num, i + 1, hm);
    }
}