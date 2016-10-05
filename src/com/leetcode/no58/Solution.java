package com.leetcode.no58;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        boolean start = false;
        for(char c : s.toCharArray()) {
            if(c == ' ')
                start = true;
            else if(start) {
                start = false;
                sb = new StringBuilder();
                sb.append(c);
            }
            else
                sb.append(c);
        }
        return sb.length();
    }
}