package com.leetcode.no202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
//	public boolean isHappy(int n) {
//		int sum;
//		while(n != 1) {
//			// 当数字为0或在[2, 6]区间时一定不是Happy数，用到数论的思想
//			if(n >= 2 && n <= 6 || n == 0) {
//				return false;
//			}
//			sum = 0;
//			while(n != 0) {
//				sum += (n % 10) * (n % 10);
//				n /= 10;
//			}
//			n = sum;
//		}
//		return true;
//	}
	Set<Integer> set = new HashSet<Integer>();
	public boolean isHappy(int n) {
		int sum;
		while(n != 1) {
			if(set.contains(n)) {
				return false;
			}
			else {
				set.add(n);
				sum = 0;
				while(n != 0) {
					sum += (n % 10) * (n % 10);
					n /= 10;
				}
				n = sum;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().isHappy(7));
	}
}