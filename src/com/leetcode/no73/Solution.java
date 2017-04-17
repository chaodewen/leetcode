package com.leetcode.no73;

import java.util.Arrays;

public class Solution {
	public void setZeroes(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0)
			return;

		int row = matrix.length, col = matrix[0].length, index = 0;
		// index是第一行首个0的位置，若第一行均不为0则index为n
		while(index < col && matrix[0][index] != 0)
			index ++;

		for(int i = 1; i < row; i ++)
			for(int j = 0; j < col; j ++)
				if(matrix[i][j] == 0)
					matrix[0][j] = matrix[i][0] = 0;

		for(int i = 1; i < row; i ++)
			for(int j = col - 1; j >= 0; j --) // 必须从右向左，防止因为matrix[0][j]修改最左边的数为0
				if(matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;

		if(index < col)
			Arrays.fill(matrix[0], 0);
	}
}