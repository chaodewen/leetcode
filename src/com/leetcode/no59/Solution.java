package com.leetcode.no59;

public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] ret = new int[n][n];
		if(n == 0) {
			return ret;
		}
		else {
			int num = 1;
			for(int i = 0; i < n / 2; i ++) {
				for(int j = i; j < n - 1 - i; j ++) {
					ret[i][j] = num ++;
				}
				for(int j = i; j < n - 1 - i; j ++) {
					ret[j][n - i - 1] = num ++;
				}
				for(int j = i; j < n - 1 - i; j ++) {
					ret[n - 1 - i][n - 1 - j] = num ++;
				}
				for(int j = i; j < n - 1- i; j ++) {
					ret[n - 1 - j][i] = num ++;
				}
			}
			if(ret[n / 2][n / 2] == 0) {
				ret[n / 2][n / 2] = num;
			}
			return ret;
		}
	}
	public static void main(String[] args) {
		int n = 4;
		int[][] ret = new Solution().generateMatrix(n);
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) {
				System.out.print(ret[i][j] + " ");
			}
			System.out.println();
		}
	}
}