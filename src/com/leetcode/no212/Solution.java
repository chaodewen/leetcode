package com.leetcode.no212;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
    	List<String> list = new ArrayList<>();
        TrieNode head = buildTrie(words);
        int row = board.length, col = board[0].length;
        for(int i = 0; i < row; i ++) {
        	for(int j = 0; j < col; j ++) {
        		search(i, j, board, head, list);
        	}
        }
        return list;
    }
    private void search(int i, int j, char[][] board
    	, TrieNode p, List<String> list) {
    	char c = board[i][j];
    	if(c != '#' && p.next[c - 'a'] != null) {
    		p = p.next[c - 'a'];
    		if(p.word != null) {
	    		list.add(p.word);
	    		p.word = null;
	    	}
    		board[i][j] = '#';
    		int row = board.length, col = board[0].length;
    		if(i > 0) {
    			search(i - 1, j, board, p, list);
    		}
    		if(i < row - 1) {
    			search(i + 1, j, board, p, list);
    		}
    		if(j > 0) {
    			search(i, j - 1, board, p, list);
    		}
    		if(j < col - 1) {
    			search(i, j + 1, board, p, list);
    		}
    		board[i][j] = c;
    	}
    }
    private TrieNode buildTrie(String[] words) {
    	TrieNode head = new TrieNode();
    	for(String word : words) {
    		TrieNode p = head;
    		char[] chars = word.toCharArray();
    		for(char c : chars) {
    			if(p.next[c - 'a'] == null) {
    				p.next[c - 'a'] = new TrieNode();
    			}
    			p = p.next[c - 'a'];
    		}
    		p.word = word;
    	}
    	return head;
    }
}

class TrieNode {
	TrieNode[] next = new TrieNode[26];
	String word;
}