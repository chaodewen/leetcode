package com.leetcode.no495;

/**
 * Created by Cc on 2017/2/18.
 */

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;

        for(int i = 0; i < timeSeries.length; i ++)
            if(i != timeSeries.length - 1) {
                if(timeSeries[i] + duration - 1 >= timeSeries[i + 1])
                    time += timeSeries[i + 1] - timeSeries[i];
                else
                    time += duration;
            }
            else
                time += duration;

        return time;
    }
}