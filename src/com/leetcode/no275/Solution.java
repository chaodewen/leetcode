package com.leetcode.no275;

/**
 * Created by Dewayne on 2016/10/11.
 */

public class Solution {
    public int hIndex(int[] citations) {
        for(int i = citations.length - 1; i >= 0; i --)
            if(citations[i] < citations.length - i)
                return citations.length - i - 1;
            else if(citations[i] == citations.length - i)
                return citations.length - i;
        return citations.length;
    }
}