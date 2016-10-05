package com.leetcode.no190;

/**
 * Created by Cc on 16/10/6.
 */

public class Solution {
    // you need treat n as an unsigned value
    // public int reverseBits(int n) {
    //     boolean isHighOne, isLowOne;
    //     int high = Integer.MIN_VALUE, low = 1;
    //     for(int i = 0; i < 16; i ++) {
    //         isHighOne = (high & n) == high ? true : false;
    //         isLowOne = (low & n) == low ? true : false;
    //         if(isHighOne != isLowOne)
    //             if(isHighOne) {
    //                 n &= (~ high);
    //                 n |= low;
    //             }
    //             else {
    //                 n |= high;
    //                 n &= (~ low);
    //             }
    //         high >>>= 1;
    //         low <<= 1;
    //     }
    //     return n;
    // }

    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i ++) {
            result |= ((n >> i) & 1) << (31 - i);
        }
        return result;
    }
}