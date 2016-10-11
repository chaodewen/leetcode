package com.leetcode.no274;

import java.util.Arrays;

/**
 * Created by Dewayne on 2016/10/11.
 */

// public class Solution {
//     public int hIndex(int[] citations) {
//         Arrays.sort(citations);
//         for(int i = citations.length - 1; i >= 0; i --)
//             if(citations[i] < citations.length - i)
//                 return citations.length - i - 1;
//             else if(citations[i] == citations.length - i)
//                 return citations.length - i;
//         return citations.length;
//     }
// }

public class Solution {
    public int hIndex(int[] citations) {
        int[] cnt = new int[citations.length + 1];
        for(int i = 0; i < citations.length; i ++)
            if(citations[i] >= citations.length)
                cnt[citations.length] ++;
            else
                cnt[citations[i]] ++;
        int ans = 0;
        for(int i = citations.length; i >= 0; i --) {
            ans += cnt[i];
            if(ans >= i)
                return i;
        }
        return ans;
    }
}