package com.leetcode.no371;

public class Solution {
    public int getSum(int a, int b) {
        boolean carry = false;
        int result = 0;
        for(int i = 0; i < 32; i ++) {
        	int bita = (a >> i) & 1;
        	int bitb = (b >> i) & 1;
        	if(bita == 0 && bitb == 0) {
        		if(carry) {
        			carry = false;
        			result |= 1 << i;
        		}
        	}
        	else if(bita == 1 && bitb == 1) {
        		if(carry)
        			result |= 1 << i;
        		carry = true;
        	}
        	else {
        		if(!carry)
        			result |= 1 << i;
        	}
        }
        return result;
    }
}