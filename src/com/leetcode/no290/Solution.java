package com.leetcode.no290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length)
            return false;
        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        for(int i = 0; i < pattern.length(); i ++)
            if(p2s.containsKey(pattern.charAt(i)) && s2p.containsKey(strs[i])) {
                if(!p2s.get(pattern.charAt(i)).equals(strs[i]) || !s2p.get(strs[i]).equals(pattern.charAt(i)))
                    return false;
            }
            else if(!p2s.containsKey(pattern.charAt(i)) && !s2p.containsKey(strs[i])) {
                p2s.put(pattern.charAt(i), strs[i]);
                s2p.put(strs[i], pattern.charAt(i));
            }
            else
                return false;
        return true;
    }
}