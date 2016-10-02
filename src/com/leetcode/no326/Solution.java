package com.leetcode.no326;

public class Solution {
	// 若1162261467可以整除n，那么n的质因数只有3
	public boolean isPowerOfThree(int n) {
		return n > 0 && (1162261467 % n == 0);
	}
	// 计算出Integer中最大的质因数只有3的数是1162261467
	public static void main(String[] args) {
		int exp = (int) (Math.log(Integer.MAX_VALUE) / Math.log(3));
		int maxValue = (int) Math.pow(3, exp);
		System.out.println(maxValue);
	}
}