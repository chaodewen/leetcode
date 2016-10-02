package com.leetcode.no386;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i ++)
        	dfs(i, n, list);
        return list;
    }
    private void dfs(int cur, int n, List<Integer> list) {
    	if(cur <= n) {
	    	list.add(cur);
	    	for(int i = 0; i < 10; i ++)
	    		if(cur * 10 + i > n)
	    			return;
	    		else
	    			dfs(cur * 10 + i, n, list);
    	}
    }
}