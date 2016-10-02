package com.leetcode.no258;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Solution {
	public int addDigits(int num) {
		if(num % 9 == 0 && num != 9 && num != 0) {
			return 9;
		}
		else {
			return ((num < 10) ? num : (num % 9));
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Solution solution = new Solution();
		while(in.hasNext()) {
			int num = in.nextInt();
			System.out.println(num + ":" + solution.addDigits(num));
		}
		in.close();
	}
}
