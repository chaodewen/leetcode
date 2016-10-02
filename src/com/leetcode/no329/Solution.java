package com.leetcode.no329;

public class Solution {
    int[][] bigRec, smallRec;
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int max = 0;
        bigRec = new int[matrix.length][matrix[0].length];
        smallRec = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i ++)
            for(int j = 0; j < matrix[0].length; j ++) {
                boolean[][] rec = new boolean[matrix.length][matrix[0].length];
                int bigger = search(matrix, i, j, true, rec);
                int smaller = search(matrix, i, j, false, rec);
                max = Math.max(bigger + smaller - 1, max);
            }
        return max;
    }
    private int search(int[][] matrix, int i, int j, boolean big, boolean[][] rec) {
        if(big && bigRec[i][j] != 0)
            return bigRec[i][j];
        else if(!big && smallRec[i][j] != 0)
            return smallRec[i][j];
        int ret = 0;
        rec[i][j] = true;
        if(i - 1 >= 0 && cmp(matrix[i - 1][j], matrix[i][j], big))
            ret = Math.max(search(matrix, i - 1, j, big, rec), ret);
        if(i + 1 < matrix.length && cmp(matrix[i + 1][j], matrix[i][j], big))
            ret = Math.max(search(matrix, i + 1, j, big, rec), ret);
        if(j - 1 >= 0 && cmp(matrix[i][j - 1], matrix[i][j], big))
            ret = Math.max(search(matrix, i, j - 1, big, rec), ret);
        if(j + 1 < matrix[0].length && cmp(matrix[i][j + 1], matrix[i][j], big))
            ret = Math.max(search(matrix, i, j + 1, big, rec), ret);
        rec[i][j] = false;
        if(big)
            bigRec[i][j] = ret + 1;
        else
            smallRec[i][j] = ret + 1;
        return ret + 1;
    }
    private boolean cmp(int a, int b, boolean big) {
        if(big)
            return a > b;
        else
            return a < b;
    }
}