package com.leetcode.no405;

public class Solution {
    char[] bits = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex(int num) {
        String ret = "";
        int temp = 15 << 28;
        boolean zero = false;
        for(int i = 7; i >= 0; i --) {
        	// 无符号右移只进行移位操作，高位补零，不进行补码转换
        	int idx = (temp & num) >>> (i * 4);
            if(zero || idx > 0) {
                ret += bits[idx];
                zero = true;
            }
            temp >>>= 4;
        }
        return zero ? ret : "0";
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.toHex(26));
    }
}