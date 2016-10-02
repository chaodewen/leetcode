package com.leetcode.no376;

public class Solution {
    public int wiggleMaxLength(int[] nums) {
    	if(nums.length == 0 || nums.length == 1)
    		return nums.length;
    	// 去掉开头相同的数字
    	int i = 0;
        while(i + 1 < nums.length)
        	if(nums[i + 1] == nums[i])
        		i ++;
        	else
        		break;
        if(i == nums.length - 1)
        	return 1;
        boolean bigNow = nums[i] > nums[i + 1] ? true : false;
        int cnt = 2, last = nums[i + 1];
        for(i += 2; i < nums.length; i ++)
        	if(bigNow) {
        		if(nums[i] > last) {
        			bigNow = false;
        			last = nums[i];
        			cnt ++;
        		}
        		else if(nums[i] < last)
        			last = nums[i];
        	}
        	else {
        		if(nums[i] > last)
        			last = nums[i];
        		else if(nums[i] < last) {
        			bigNow = true;
        			last = nums[i];
        			cnt ++;
        		}
        	}
        return cnt;
    }
    public static void main(String[] args) {
    	int[] nums = new int[] { 1,7,4,9,2,5 };
//    	int[] nums = new int[] { 1,1,1,2,2,2,3,2,10,3,3,3,6 };
//    	int[] nums = new int[] {};
//    	int[] nums = new int[] { 84 };
//    	int[] nums = new int[] { 0,0,0,0 };
    	Solution s = new Solution();
    	System.out.println(s.wiggleMaxLength(nums));
    }
}