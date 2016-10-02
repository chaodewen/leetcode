package com.leetcode.no343;

public class Solution {
	// 统计规律发现由3和2组成的结果最大，优先选择3
	public int integerBreak(int n) {
		if(n == 2 || n == 3) {
			return n - 1;
		}
		else {
			int multi = 1;
			while(n >= 0) {
				n -= 3;
				if(n == 0) {
					multi *= 3;
					break;
				}
				else if(n == 1) {
					// 剩下1时收回之前的3，和这个1组成两个2
					multi *= 4;
					break;
				}
				else if(n == 2) {
					multi *= 6;
					break;
				}
				else {
					multi *= 3;
				}
			}
			return multi;
		}
	}
}