package com.leetcode.no7;

/**
 * Created by Dewayne on 2016/10/5.
 */

public class Solution {
    public int reverse(int x) {
        // 不先对x进行转换的话，如果x为最小的负数时abs的结果还为负
        // 因为没有对应的正数
        long temp = Math.abs((long) x), result = 0;
        for(int i = 0; i < 31 && temp != 0; i ++) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        return (int) (result > Integer.MAX_VALUE ? 0 : (x >= 0 ? result : (- result)));
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(-2147483648));
    }
}