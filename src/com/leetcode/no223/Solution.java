package com.leetcode.no223;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = (C - A) * (D - B) + (G - E) * (H - F);
        if(E >= C || F >= D || G <= A || H <= B)
            return sum;
        int lbx = Math.max(A, E), lby = Math.max(B, F);
        int rtx = Math.min(C, G), rty = Math.min(D, H);
        return sum - (rtx - lbx) * (rty - lby);
    }
}