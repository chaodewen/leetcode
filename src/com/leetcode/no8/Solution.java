package com.leetcode.no8;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public int myAtoi(String str) {
        if(str.length() == 0) // 1.非空
            return 0;

        int sign = 1, base = 0, i = 0;

        while(str.charAt(i) == ' ') // 2.去空格
            i ++; // 不能写在条件中，防止第一个数不是空格

        if(str.charAt(i) == '+' || str.charAt(i) == '-') // 3.存符号
            sign = str.charAt(i ++) == '+' ? 1 : -1;

        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') { // 4.跳过非法输入
            if(base > Integer.MAX_VALUE / 10 || base == Integer.MAX_VALUE / 10 && str.charAt(i) > '7') // 5.防溢出负数已考虑
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            base = base * 10 + str.charAt(i ++) - '0'; // 正常运算,注意 2147483640 + 8 = - 2147483648
        }

        return base * sign;
    }
}