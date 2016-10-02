package com.leetcode.no289;

public class Solution {
    public void gameOfLife(int[][] board) {
    	int row = board.length, col = board[0].length;
        for(int i = 0; i < row; i ++)
        	for(int j = 0; j < col; j ++) {
        		int lives = 0;
        		if(i - 1 >= 0) {
        			if(j - 1 >= 0 && (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == 2))
        				lives ++;
        			if(board[i - 1][j] == 1 || board[i - 1][j] == 2)
        				lives ++;
        			if(j + 1 < col && (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == 2))
        				lives ++;
        		}
        		if(j - 1 >= 0 && (board[i][j - 1] == 1 || board[i][j - 1] == 2))
        			lives ++;
        		if(j + 1 < col && (board[i][j + 1] == 1 || board[i][j + 1] == 2))
        			lives ++;
        		if(i + 1 < row) {
        			if(j - 1 >= 0 && (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == 2))
        				lives ++;
        			if(board[i + 1][j] == 1 || board[i + 1][j] == 2)
        				lives ++;
        			if(j + 1 < col && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == 2))
        				lives ++;
        		}
        		if(board[i][j] == 1 && (lives < 2 || lives > 3))
        			board[i][j] = 2;
        		else if(board[i][j] == 0 && lives == 3)
        			board[i][j] = 3;
        	}
        for(int i = 0; i < row; i ++)
        	for(int j = 0; j < col; j ++)
        		if(board[i][j] == 2)
        			board[i][j] = 0;
        		else if(board[i][j] == 3)
        			board[i][j] = 1;
    }
}