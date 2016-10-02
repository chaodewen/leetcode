package com.leetcode.no299;

public class Solution {
    public String getHint(String secret, String guess) {
        int[] sec = new int[10], gue = new int[10];
        int a = 0, b = 0;
        for(int i = 0; i < secret.length(); i ++)
            if(secret.charAt(i) == guess.charAt(i))
                a ++;
            else {
                sec[secret.charAt(i) - '0'] ++;
                gue[guess.charAt(i) - '0'] ++;
            }
        for(int i = 0; i < 10; i ++)
            b += Math.min(sec[i], gue[i]);
        return String.valueOf(a) + "A" + String.valueOf(b) + "B";
    }
}