package com.leetcode.no59;

public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];

		if(n == 0)
			return matrix;

		int left = 0, right = n - 1, up = 0, down = n - 1, val = 1;

		while(left <= right && up <= down) {
			for(int i = left; i <= right; i ++)
				matrix[up][i] = val ++;

			up ++;

			for(int i = up; i <= down; i ++)
				matrix[i][right] = val ++;

			right --;

			if(up <= down) {
				for(int i = right; i >= left; i --)
					matrix[down][i] = val ++;

				down --;
			}

			if(left <= right) {
				for(int i = down; i >= up; i --)
					matrix[i][left] = val ++;

				left ++;
			}
		}

		return matrix;
	}
}