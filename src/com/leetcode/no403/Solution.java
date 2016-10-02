package com.leetcode.no403;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1] != 1)
        	return false;
        int len = stones.length;
        if(len == 2)
        	return true;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] rec = new boolean[len];
        for(int i = 1; i < len - 1; i ++)
        	if(Math.abs(stones[i] + i - stones[len - 1]) <= 1) {
        		if(i == 1)
        			return true;
        		queue.offer(i);
        		rec[i] = true;
        	}
        while(!queue.isEmpty()) {
        	int index = queue.remove();
        	for(int i = 1; i < index; i ++)
        		if(!rec[i] && Math.abs(stones[i] + i - stones[index]) <= 1) {
        			if(i == 1)
        				return true;
        			queue.offer(i);
        			rec[i] = true;
        		}
        }
        return false;
    }
}