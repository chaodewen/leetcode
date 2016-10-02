package com.leetcode.no151;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String reverseWords(String s) {
        if(s.equals(" ") || s.equals(""))
            return "";
        char[] chars = s.toCharArray();
        List<String> words = new ArrayList<>();
        String word = "";
        for(int i = 0; i < chars.length; i ++) {
            if(chars[i] == ' ' && i - 1 >= 0 && chars[i - 1] != ' ') {
                words.add(word);
                word = "";
            }
            else if(chars[i] != ' ')
                word += chars[i];
        }
        if(chars[chars.length - 1] != ' ') {
        	words.add(word);
        }
        String result = "";
        int len = words.size();
        for(int i = len - 1; i >= 0; i --) {
            word = words.get(i);
            result += word;
            if(i != 0) {
                result += " ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.reverseWords(" the   sky is blue "));
    	System.out.println(s.reverseWords(" "));
    	System.out.println(s.reverseWords("    "));
    }
}