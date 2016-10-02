package com.leetcode.no383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rec = new int[26];
        for(int i = 0; i < ransomNote.length(); i ++)
        	rec[ransomNote.charAt(i) - 'a'] ++;
        for(int i = 0; i < magazine.length(); i ++)
        	if(rec[magazine.charAt(i) - 'a'] > 0)
        		rec[magazine.charAt(i) - 'a'] --;
        for(int i = 0; i < 26; i ++)
        	if(rec[i] > 0)
        		return false;
        return true;
    }
}