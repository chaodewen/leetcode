package com.leetcode.no8;

/**
 * Created by Dewayne on 2016/10/7.
 */

public class Solution {
    public int myAtoi(String str) {
        boolean sign = true;
        int start = -1;

        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (i + 1 == str.length() || str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9')
                    break;
                if (str.charAt(i) == '-')
                    sign = false;

                start = i + 1;
                break;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                start = i;
                break;
            } else if (str.charAt(i) != ' ')
                break;
        }

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

//    public int atoi(String str) {
//        int len = 0, start = -1, ans = 0;
//
//        boolean positive = true;
//
//        for(int i = 0; i < str.length(); i ++) {
//            if(start == -1) {
//                if(str.charAt(i) == '+' || str.charAt(i) == '-') {
//                    if(i + 1 < str.length() && str.charAt(i + 1) >= '0'
//                            && str.charAt(i + 1) <= '9') {
//                        start = i + 1;
//                        positive = str.charAt(i) == '+' ? true : false;
//                    }
//                    else
//                        break;
//                }
//                else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                    start = i;
//                    len ++;
//                }
//            }
//            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                len ++;
//            }
//            else
//                break;
//        }
//
//        if(len == 0)
//            return 0;
//
//        str = str.substring(start, start + len);
//
//        if(isOutOfBound(positive, str))
//            return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//
//        for(int i = 0; i < str.length(); i ++)
//            if(positive)
//                ans = ans * 10 + (str.charAt(i) - '0');
//            else
//                ans = ans * 10 - (str.charAt(i) - '0');
//
//        return ans;
//    }
//    private boolean isOutOfBound(boolean positive, String str) {
//        if(str.length() > 10)
//            return true;
//
//        if(str.length() == 10)
//            for(int i = 0; i < str.length(); i ++) {
//                if(positive) {
//                    if(str.charAt(i) - '0' > (Integer.MAX_VALUE / (int) Math.pow(10, 10 - i - 1)) % 10)
//                        return true;
//                    else if(str.charAt(i) - '0' < (Integer.MAX_VALUE / (int) Math.pow(10, 10 - i - 1)) % 10)
//                        break;
//                }
//                else {
//                    if('0' - str.charAt(i) < (Integer.MIN_VALUE / (int) Math.pow(10, 10 - i - 1)) % 10)
//                        return true;
//                    else if('0' - str.charAt(i) < (Integer.MIN_VALUE / (int) Math.pow(10, 10 - i - 1)) % 10)
//                        break;
//                }
//            }
//
//        return false;
//    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.atoi("2147483648"));
//        System.out.println(s.atoi("-2147483649"));
//        System.out.println(s.atoi("-5211314"));
//        System.out.println(s.atoi("-10"));
//        System.out.println(s.atoi("10"));
//        System.out.println(s.atoi("    52lintcode   "));

//        System.out.println("2147483648".charAt(0) - '0');
//        System.out.println((Integer.MAX_VALUE / (int) Math.pow(10, 10 - 0 - 1)));
//        System.out.println((Integer.MAX_VALUE / Math.pow(10, 10 - 0 - 1)) % 10);
//        System.out.println("2147483648".charAt(0) - '0' < (Integer.MAX_VALUE / Math.pow(10, 10 - 0 - 1)) % 10);
    }
}