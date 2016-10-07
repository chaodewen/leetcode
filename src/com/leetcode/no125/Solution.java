package com.leetcode.no125;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public boolean isPalindrome(String s) {
        char[] sc = s.toCharArray();
        int low = 0, high = sc.length - 1;
        while(low < high) {
            if(!(sc[low] >= 'a' && sc[low] <= 'z'
                    || sc[low] >= 'A' && sc[low] <= 'Z'
                    || sc[low] >= '0' && sc[low] <= '9')) {
                low ++;
                continue;
            }
            if(!(sc[high] >= 'a' && sc[high] <= 'z'
                    || sc[high] >= 'A' && sc[high] <= 'Z'
                    || sc[high] >= '0' && sc[high] <= '9')) {
                high --;
                continue;
            }
            if((!(sc[low] >= '0' && sc[low] <= '9')) && sc[low] >= 'a' && sc[low] <= 'z')
                sc[low] += 'A' - 'a';
            if((!(sc[high] >= '0' && sc[high] <= '9')) && sc[high] >= 'a' && sc[high] <= 'z')
                sc[high] += 'A' - 'a';
            if(sc[low ++] != sc[high--])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("1b1"));
    }
}