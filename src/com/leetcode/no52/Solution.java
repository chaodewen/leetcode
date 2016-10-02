package com.leetcode.no52;

public class Solution {
	int[] pos = new int[100];
	int len;
	int cnt;
	private boolean canPlace(int col, int row) {
		for(int i = 0; i < col; i ++) {
			if(pos[i] == row) {
				return false;
			}
			else if((pos[i] + i == col + row) || (col - i == row - pos[i])) {
				return false;
			}
		}
		return true;
	}
	private void search(int col) {
		for(int row = 0; row < len; row ++) {
			if(canPlace(col, row)) {
				pos[col] = row;
				if(col == len - 1) {
					cnt ++;
				}
				else {
					search(col + 1);
				}
			}
		}
	}
	public int totalNQueens(int n) {
		len = n;
		cnt = 0;
		search(0);
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().totalNQueens(4));
	}
}
