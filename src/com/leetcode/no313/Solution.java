package com.leetcode.no313;

public class Solution {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int[] ugly = new int[n];
		ugly[0] = 1;

		// 每个值为对应primes中的值指向下一个要乘的数
		// 保证这是该数能产生的下一个最小丑数
		int[] pointer = new int[primes.length];

		for(int i = 1; i < n; i ++) {
			int min = Integer.MAX_VALUE;

			// 为每个primes中的数生成下一个最小丑数
			// 比较这些丑数，留下最小值作为下一个丑数
			for(int j = 0; j < primes.length; j ++)
				min = Math.min(min, ugly[pointer[j]] * primes[j]);

			ugly[i] = min;

			// 根据留下的最小丑数移动pointer所指的数
			// 结果的两个因数均为primes中的数时会移动两个pointer
			for(int j = 0; j < primes.length; j ++)
				if(min == ugly[pointer[j]] * primes[j])
					pointer[j] ++;
		}

		return ugly[n - 1];
	}
}