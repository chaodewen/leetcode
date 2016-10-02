package com.leetcode.no42;

public class Solution {
    public int trap(int[] height) {
        if(height.length <= 2)
            return 0;
        int sum = 0, left = 0, right = height.length - 1;
        int leftBar = height[left ++], rightBar = height[right --];
        while(left <= right)
            if(leftBar > rightBar)
                if(rightBar > height[right])
                    sum += rightBar - height[right --];
                else
                    rightBar = height[right --];
            else
                if(leftBar > height[left])
                    sum += leftBar - height[left ++];
                else
                    leftBar = height[left ++];
        return sum;
    }
}