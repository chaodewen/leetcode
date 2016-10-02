package com.leetcode.no367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        int left = 0, right = num / 2, mid;
        long sq;
        while(left <= right) {
            mid = (left + right) / 2;
            sq = ((long) mid) * ((long) mid);
            if(sq == num)
                return true;
            else if(sq > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}