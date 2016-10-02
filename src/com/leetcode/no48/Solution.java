package com.leetcode.no48;

public class Solution {
	public void rotate(int[][] matrix) {
		int len = matrix.length, temp;
		for(int i = 0; i < len / 2; i ++) {
			for(int j = i; j < len - i - 1; j ++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[len - 1 - j][i];
				matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
				matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
				matrix[j][len - 1 - i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] data = new int[2][2];
		data[0][0] = 1;
		data[0][1] = 2;
		data[1][0] = 3;
		data[1][1] = 4;
//		int[][] data = new int[3][3];
//		data[0][0] = 1;
//		data[0][1] = 2;
//		data[0][2] = 3;
//		data[1][0] = 4;
//		data[1][1] = 5;
//		data[1][2] = 6;
//		data[2][0] = 7;
//		data[2][1] = 8;
//		data[2][2] = 9;
//		int[][] data = new int[4][4];
//		data[0][0] = 1;
//		data[0][1] = 2;
//		data[0][2] = 3;
//		data[0][3] = 4;
//		data[1][0] = 5;
//		data[1][1] = 6;
//		data[1][2] = 7;
//		data[1][3] = 8;
//		data[2][0] = 9;
//		data[2][1] = 10;
//		data[2][2] = 11;
//		data[2][3] = 12;
//		data[3][0] = 13;
//		data[3][1] = 14;
//		data[3][2] = 15;
//		data[3][3] = 16;
		new Solution().rotate(data);
	}
}