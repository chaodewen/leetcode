package com.leetcode.no51;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<List<String>> ret;
	int[] pos = new int[100];
	int len;
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
					storeBoard();
				}
				else {
					search(col + 1);
				}
			}
		}
	}
	private void storeBoard() {
		List<String> list = new ArrayList<String>(len);
		for(int col = 0; col < len; col ++) {
			StringBuilder sb = new StringBuilder();
			for(int row = 0; row < len; row ++) {
				if(row == pos[col]) {
					sb.append("Q");
				}
				else {
					sb.append(".");
				}
			}
			list.add(sb.toString());
		}
		ret.add(list);
	}
	public List<List<String>> solveNQueens(int n) {
		len = n;
		ret = new ArrayList<List<String>>(n);
		search(0);
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().solveNQueens(8));
	}
}