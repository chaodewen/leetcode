package com.leetcode.no74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;

        int row = matrix.length, i = 0, j = matrix[0].length - 1;

        while(j >= 0 && i < row) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j --;
            else
                i ++;
        }

        return false;
    }
}