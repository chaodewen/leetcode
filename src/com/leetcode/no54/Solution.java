package com.leetcode.no54;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dewayne on 2017/2/27.
 */

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();

        if(matrix.length == 0)
            return list;

        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while(up <= down && left <= right) {
            for(int i = left; i <= right; i ++)
                list.add(matrix[up][i]);

            up ++;

            for(int i = up; i <= down; i ++)
                list.add(matrix[i][right]);

            right --;

            if(up <= down) {
                for(int i = right; i >= left; i --)
                    list.add(matrix[down][i]);

                down --;
            }

            if(left <= right) {
                for(int i = down; i >= up; i --)
                    list.add(matrix[i][left]);

                left ++;
            }
        }

        return list;
    }
}