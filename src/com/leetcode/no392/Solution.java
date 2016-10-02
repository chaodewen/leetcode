package com.leetcode.no392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        char[] schars = s.toCharArray();
        int i = 0, j = 0;
        boolean sign = false;
        for(; i < schars.length; i ++) {
            sign = false;
            while(j < t.length())
                if(schars[i] == t.charAt(j ++)) {
                    sign = true;
                    break;
                }
        }
        return i == schars.length && j <= t.length() && sign ? true : false;
    }
}