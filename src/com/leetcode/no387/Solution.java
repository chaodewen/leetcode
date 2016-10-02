package com.leetcode.no387;

public class Solution {
    public int firstUniqChar(String s) {
        int[] rec = new int[26];
        for(int i = 0; i < s.length(); i ++)
        	rec[s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
        	if(rec[s.charAt(i) - 'a'] == 1)
        		return i;
        return -1;
    }
}