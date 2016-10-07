package com.leetcode.no204;

/**
 * Created by Cc on 16/10/7.
 */

public class Solution {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        for(int i = 2; i * i < n; i ++)
            if(!isNotPrime[i]) // 如果是合数说明是之前标记的，那么接下来的循环中的数已经产生过
                for(int j = i; i * j <= n; j ++)
                    isNotPrime[i * j] = true;
        int cnt = 0;
        for(int i = 2; i < n; i ++)
            if(!isNotPrime[i]) cnt ++;
        return cnt;
    }
}