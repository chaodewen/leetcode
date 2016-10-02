package com.leetcode.no43;

//import java.math.BigInteger;

public class Solution {
////	public String multiply(String num1, String num2) {
////		BigInteger n1 = new BigInteger(num1);
////		BigInteger n2 = new BigInteger(num2);
////		return n1.multiply(n2).toString();
////	}
	public String multiply(String num1, String num2) {
		int len1 = num1.length(), len2 = num2.length();
		int[] product = new int[len1 + len2];
		for(int i = len1 - 1; i >= 0; i --) {
			for(int j = len2 - 1; j >= 0; j --) {
				int index = (len1 - 1) - i + (len2 - 1) - j;
				product[index] += ((int) (num1.charAt(i) - '0')) * ((int) (num2.charAt(j) - '0'));
				product[index + 1] += product[index] / 10;
				product[index] %= 10;
			}
		}
		StringBuffer sb = new StringBuffer();
		int len = product.length;
		for(int i = len - 1; i >= 0; i --) {
			// 当sb已经不为空或者此时product[i]不是0时可以填入数字
			if(sb.length() != 0 || product[i] != 0) {
				sb.append(product[i]);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}