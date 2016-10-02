package com.leetcode.no36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i ++)
            for(int j = 0; j < 9; j ++)
                if(board[i][j] != '.')
                    if(set.contains("<" + String.valueOf(i) + ">" + board[i][j]) 
                        || set.contains(board[i][j] + "<" + String.valueOf(j) + ">")
                        || set.contains("c" + "<" + (i / 3 * 3 + j / 3) + ">" + board[i][j]))
                        return false;
                    else {
                        set.add("<" + String.valueOf(i) + ">"  + board[i][j]);
                        set.add(board[i][j] + "<" + String.valueOf(j) + ">");
                        set.add("c" + "<" + (i / 3 * 3 + j / 3) + ">" + board[i][j]);
                    }
        return true;
    }
}