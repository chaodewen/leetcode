package com.leetcode.no240;

public class Solution {
	// 从左下或右上开始搜索，二维二分不好解决数组只有一维时的情况
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length, cols = matrix[0].length;
		int i = rows - 1, j = 0;
		while(i >= 0 && j < cols) {
			if(matrix[i][j] == target) {
				return true;
			}
			else if(matrix[i][j] < target) {
				j ++;
			}
			else {
				i --;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
//		int[][] matrix = new int[][] { 
//			{ 1, 4, 7, 11, 15 }, 
//			{ 2, 5, 8, 12, 19 }, 
//			{ 3, 6, 9, 16, 22 },
//			{ 10, 13, 14, 17, 24 }, 
//			{ 18, 21, 23, 26, 30 } };
		int[][] matrix = new int[][] { { -1, 3 } };
		System.out.println(s.searchMatrix(matrix, 3));
//		System.out.println(s.searchMatrix(matrix, 5));
//		System.out.println(s.searchMatrix(matrix, 20));
	}
}