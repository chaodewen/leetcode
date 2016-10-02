package com.leetcode.no205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for(int i = 0; i < s.length(); i ++)
            if(s2t.containsKey(s.charAt(i)) && t2s.containsKey(t.charAt(i))) {
                if(!s2t.get(s.charAt(i)).equals(t.charAt(i)) || !t2s.get(t.charAt(i)).equals(s.charAt(i)))
                    return false;
            }
            else if(!s2t.containsKey(s.charAt(i)) && !t2s.containsKey(t.charAt(i))) {
                s2t.put(s.charAt(i), t.charAt(i));
                t2s.put(t.charAt(i), s.charAt(i));
            }
            else
                return false;
        return true;
    }
}