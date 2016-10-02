package com.leetcode.no389;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] srec = new int[26], trec = new int[26];
        int index = 0;
        for(int i = 0; i < s.length(); i ++)
            srec[s.charAt(i) - 'a'] ++;
        for(int i = 0; i < t.length(); i ++) {
            index = t.charAt(i) - 'a';
            trec[index] ++;
            if(trec[index] > srec[index])
                break;
        }
        return (char) ('a' + index);
    }
}