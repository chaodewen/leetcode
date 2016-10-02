package com.leetcode.no79;

public class Solution {
	public boolean exist(char[][] board, String word) {
		if(word.length() == 0) {
			return false;
		}
		int row = board.length, col = board[0].length;
		for(int i = 0; i < row; i ++) {
			for(int j = 0; j < col; j ++) {
				if(search(i, j, board, 0, word)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean search(int i, int j, char[][] board
		, int index, String word) {
		int row = board.length, col = board[0].length;
		if(index == word.length()) {
			return true;
		}
		else if(i < 0 || i >= row || j < 0 || j >= col) {
		    return false;
		}
		else if(word.charAt(index) != board[i][j]) {
		    return false;
		}
		else {
			// AC的关键：时间复杂度降低，之前创建boolean[]来记录
			board[i][j] ^= 256;
			index ++;
			boolean ret = search(i - 1, j, board, index, word)
			    || search(i + 1, j, board, index, word)
			    || search(i, j - 1, board, index, word)
			    || search(i, j + 1, board, index, word);
			board[i][j] ^= 256;
			return ret;
		}
	}
	public static void main(String[] args) {
		Solution s = new Solution();
//		char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'}, {'A','D','E','E'}};
		char[][] board = new char[][] {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaab".toCharArray()};
		String test = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(s.exist(board, test));
	}
}