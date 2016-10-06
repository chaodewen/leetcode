package com.leetcode.no397;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Cc on 16/10/6.
 */

// 用递归更简单一些
public class Solution {
    class Cnt {
        long num, cnt;
        Cnt(long num, long cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
    public int integerReplacement(int n) {
        if(n == 1) return 0;
        Queue<Cnt> queue = new LinkedList<>();
        queue.offer(new Cnt(n, 0));
        while(!queue.isEmpty()) {
            Cnt now = queue.poll();
            if(now.num % 2 == 0) {
                if(now.num / 2 == 1)
                    return (int) (now.cnt + 1);
                now.num /= 2;
                now.cnt ++;
                queue.offer(now);
            }
            else {
                if(now.num - 1 == 1)
                    return (int) (now.cnt + 1);
                queue.offer(new Cnt(now.num + 1, now.cnt + 1));
                queue.offer(new Cnt(now.num - 1, now.cnt + 1));
            }
        }
        return 0;
    }
}