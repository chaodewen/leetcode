package com.leetcode.no11;

public class Solution {
	public int maxArea(int[] height) {
		int max = 0, lowIndex = 0, highIndex = height.length - 1;
		while(lowIndex < highIndex) {
			max = Math.max(max, (highIndex - lowIndex) * Math.min(height[lowIndex], height[highIndex]));
			if(height[lowIndex] < height[highIndex])
				lowIndex ++;
			else
				highIndex --;
		}
		return max;
	}
}