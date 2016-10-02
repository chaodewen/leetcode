package com.leetcode.no394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i ++)
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                count = count * 10 + (int) (s.charAt(i) - '0');
            else if(s.charAt(i) == '[') {
                nums.push(count);
                count = 0;
                index.push(sb.length());
            }
            else if(s.charAt(i) == ']') {
                int num = nums.pop();
                int j = index.pop();
                StringBuilder part = new StringBuilder();
                while(-- num > 0)
                    part.append(sb.toString().substring(j));
                sb.append(part.toString());
            }
            else
                sb.append(s.charAt(i));
        return sb.toString();
    }
}