package com.leetcode.no393;

/**
 * Created by Dewayne on 2016/10/10.
 */

public class Solution {
    public boolean validUtf8(int[] data) {
        boolean start = false;
        int cnt = 0;
        for(int i = 0; i < data.length; i ++) {
            if(!start) {
                if(((data[i] >>> 7) & 1) == 1) {
                    for(int j = 7; j >= 0; j --)
                        if(((data[i] >>> j) & 1) == 1)
                            cnt ++;
                        else {
                            start = true;
                            break;
                        }
                }
            }
            else {
                if(((data[i] >>> 7) & 1) != 1 || ((data[i] >>> 6) & 1) != 0)
                    return false;
                cnt --;
                if(cnt == 1) {
                    cnt = 0;
                    start = false;
                }
            }
        }
        return cnt == 0;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validUtf8(new int[] {39,89,227,83,132,95,10,0}));
    }
}