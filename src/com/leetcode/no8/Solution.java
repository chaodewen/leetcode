package com.leetcode.no8;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public int myAtoi(String str) {
        boolean sign = true;
        int start = -1;
        for(int i = 0; i < str.length(); i ++)
            if(str.charAt(i) == '+'
                    || str.charAt(i) == '-') {
                if(i + 1 == str.length()
                        || str.charAt(i + 1) < '0'
                        || str.charAt(i + 1) > '9')
                    break;
                if(str.charAt(i) == '-') sign = false;
                start = i + 1;
                break;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                start = i;
                break;
            }
            else if(str.charAt(i) != ' ')
                break;
        if(start == -1)
            return 0;
        long num = str.charAt(start) - '0';
        int cnt = str.charAt(start) == '0' ? 0 : 1;
        for(int i = start + 1; i < str.length(); i ++) {
            if(str.charAt(i ) >= '0' && str.charAt(i) <= '9') {
                num = num * 10 + (str.charAt(i) - '0');
                if(num != 0) cnt ++;
            }
            else
                break;
            if(cnt > 10)
                return (int) (sign ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        if(sign)
            return (int) (num <= Integer.MAX_VALUE ? num : Integer.MAX_VALUE);
        else
            return (int) (-num >= Integer.MIN_VALUE ? -num : Integer.MIN_VALUE);
    }
}