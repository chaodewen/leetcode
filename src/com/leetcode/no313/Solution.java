package com.leetcode.no313;

// 题目修改后已超时
public class Solution {
	int len;
	int[] primesCopy;
	private int findNext(int now, int limit) {
		int ret = Integer.MAX_VALUE, temp, i = 0;
		if(primesCopy[0] == 1) {
			i ++;
		}
		for(; i < len; i ++) {
			temp = now * primesCopy[i];
			if(temp <= limit) {
				temp = findNext(temp, limit);
				if(temp < ret) {
					ret = temp;
				}
			}
			else {
				if(temp < ret) {
					ret = temp;
				}
				break;
			}
		}
		return ret;
	}
	public int nthSuperUglyNumber(int n, int[] primes) {
		if(n == 1) {
			return 1;
		}
		else {
			len = primes.length;
			primesCopy = primes;
			int cnt = 1, i = 1;
			while(cnt < n) {
				i = findNext(1, i);
				cnt ++;
				System.out.println("cnt : " + cnt + ", i : " + i);
			}
			return i;
		}
	}
	public static void main(String[] args) {
		int[] primes = new int[]{7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251};
		System.out.println(new Solution().nthSuperUglyNumber(100000, primes));
//		int[] primes = new int[]{1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32};
//		System.out.println(new Solution().nthSuperUglyNumber(12, primes));
	}
}