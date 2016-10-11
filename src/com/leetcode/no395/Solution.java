package com.leetcode.no395;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dewayne on 2016/10/11.
 */

public class Solution {
    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int[] alphabet = new int[26];
        int cnt = 0;
        for(int i = 0; i < chars.length; i ++)
            alphabet[chars[i] - 'a'] ++;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < chars.length; i ++)
            if(alphabet[chars[i] - 'a'] > 0 && alphabet[chars[i] - 'a'] < k)
                list.add(i);
        if(list.size() == 0) return chars.length;
        int ans = 0;
        for(int i = 0, start, end; i <= list.size(); i ++) {
            if(i == 0) {
                start = 0;
                end = list.get(i);
            }
            else if(i < list.size()) {
                start = list.get(i - 1) + 1;
                end = list.get(i);
            }
            else {
                start = list.get(i - 1) + 1;
                end = chars.length;
            }
            ans = Math.max(ans, longestSubstring(s.substring(start, end), k));
        }
        return ans;
    }
}