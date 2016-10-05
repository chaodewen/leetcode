package com.leetcode.no409;

/**
 * Created by Dewayne on 2016/10/5.
 */

public class Solution {
    public int longestPalindrome(String s) {
        int[] alphabet = new int[52];
        int single = 0, cnt = 0, index;
        for(char c : s.toCharArray()) {
            index = c >= 'A' && c <= 'Z' ? (c - 'A' + 26) : (c - 'a');
            if(alphabet[index] == 0) {
                alphabet[index] ++;
                single ++;
            }
            else if(alphabet[index] % 2 == 1) {
                alphabet[index] ++;
                single --;
                cnt += 2;
            }
            else {
                alphabet[index] ++;
                single ++;
            }
        }
        return single > 0 ? (cnt + 1) : cnt;
    }
}