package com.leetcode.no292;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Solution {
	public boolean canWinNim(int n) {
		if(n % 4 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		Solution solution = new Solution();
		while(in.hasNext()) {
			int n = in.nextInt();
			System.out.println(n + ":" + solution.canWinNim(n));
		}
		in.close();
	}
}
