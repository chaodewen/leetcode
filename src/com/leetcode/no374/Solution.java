package com.leetcode.no374;

import com.leetcode.GuessGame;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(guess(mid) == 0)
                return mid;
            else if(guess(mid) > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}