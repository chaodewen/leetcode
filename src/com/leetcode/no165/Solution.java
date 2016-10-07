package com.leetcode.no165;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\."), s2 = version2.split("\\.");
        int len = Math.min(s1.length, s2.length);
        for(int i = 0; i < len; i ++) {
            int v1 = Integer.valueOf(s1[i]), v2 = Integer.valueOf(s2[i]);
            if(v1 != v2) return v1 > v2 ? 1 : -1;
        }
        if(s1.length > len)
            return isZero(s1, len) ? 0 : 1;
        else if(s2.length > len)
            return isZero(s2, len) ? 0 : -1;
        else
            return 0;
    }
    private boolean isZero(String[] s, int start) {
        for(int i = start; i < s.length; i ++)
            if(Integer.valueOf(s[i]) != 0)
                return false;
        return true;
    }
}