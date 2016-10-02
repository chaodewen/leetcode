package com.leetcode.no384;

import java.util.Random;

public class Solution {
	int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	Random r = new Random();
        int[] snums = new int[nums.length];
        boolean[] rec = new boolean[nums.length];
        for(int i = 0, index; i < nums.length; i ++) {
        	do {
        		index = r.nextInt(nums.length);
        	} while(rec[index]);
        	snums[i] = nums[index];
        	rec[index] = true;
        }
        return snums;
    }
}