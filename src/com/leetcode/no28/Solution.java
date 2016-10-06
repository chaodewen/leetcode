package com.leetcode.no28;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length(); i ++)
            if(haystack.charAt(i) == needle.charAt(0) && haystack.length() - i >= needle.length()) {
                boolean success = true;
                for(int j = 1, k = i + 1; j < needle.length(); j ++, k ++)
                    if(needle.charAt(j) != haystack.charAt(k)) {
                        success = false;
                        k --;
                        break;
                    }
                if(success) return i;
            }
        return -1;
    }
}