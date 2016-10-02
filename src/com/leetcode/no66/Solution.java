package com.leetcode.no66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length, carry = 1;
        for(int i = len - 1; i >= 0; i --) {
            if(digits[i] + carry == 10) {
                digits[i] = 0;
                carry = 1;
            }
            else {
                digits[i] += carry;
                carry = 0;
                break;
            }
        }
        if(carry == 0)
            return digits;
        else {
            int[] result = new int[len + 1];
            result[0] = carry;
            for(int i = 0; i < len; i ++)
                result[i + 1] = digits[i];
            return result;
        }
    }
}