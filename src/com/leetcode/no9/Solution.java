package com.leetcode.no9;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int temp = x, len = 1, high = 1;
        while((temp /= 10) != 0) {
            len ++;
            high *= 10;
        }
        for(int i = 0; i < len / 2; i ++)
            if(x / high == x % 10) {
                x = (x - x / high * high) / 10;
                high /= 100;
            }
            else
                return false;
        return true;
    }
}