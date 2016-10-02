package com.leetcode.no378;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length, col = matrix[0].length;
        Queue<Tuple> queue = new PriorityQueue<>();
        for(int i = 0; i < col; i ++) {
        	queue.offer(new Tuple(0, i, matrix[0][i]));
        }
        for(int i = 1; i < k; i ++) {
        	Tuple tuple = queue.poll();
        	int x = tuple.x, y = tuple.y;
        	if(x != row - 1) {
        		x ++;
        		queue.offer(new Tuple(x, y, matrix[x][y]));
        	}
        }
        return queue.poll().val;
    }
}

class Tuple implements Comparable<Tuple> {
	int x, y, val;
	Tuple(int x, int y, int val) {
		this.x = x;
		this.y = y;
		this.val = val;
	}
	@Override
	public int compareTo(Tuple tuple) {
		return val - tuple.val;
	}
}