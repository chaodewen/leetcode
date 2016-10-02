package com.leetcode.no74;

public class Solution {
	private boolean searchRow(int[] arr, int target, int len) {
		int low = 0, high = len - 1, mid;
		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] == target) {
				return true;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;;
			}
		}
		return false;
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length, col = matrix[0].length;
		for(int i = 0; i < row; i ++) {
			if(target >= matrix[i][0] && target <= matrix[i][col - 1]) {
				return searchRow(matrix[i], target, col);
			}
		}
		return false;
	}
}