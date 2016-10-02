package com.leetcode.no399;

public class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
    	double[] res = new double[queries.length];
        for(int i = 0; i < queries.length; i ++)
        	res[i] = cal(equations, values, queries[i][0], queries[i][1], new boolean[equations.length]);
        return res;
    }
    private double cal(String[][] equations, double[] values, String up, String down, boolean[] rec) {
    	boolean hasUp = false, hasDown = false;
    	// 直接查找，并记录是否根本就不存在up或者down
    	for(int i = 0; i < equations.length; i ++) {
    		if(!hasUp && (equations[i][0].equals(up) || equations[i][1].equals(up)))
    			hasUp = true;
    		if(!hasDown && (equations[i][0].equals(down) || equations[i][1].equals(down)))
    			hasDown = true;
    		if(up.equals(equations[i][0]) && down.equals(equations[i][1]))
    			return values[i];
    		else if(up.equals(equations[i][1]) && down.equals(equations[i][0]))
    			return 1.0 / values[i];
    	}
    	// 不存在up或者down时返回找不到
    	if(!hasUp || !hasDown)
    		return - 1.0;
    	// 间接查找，key的顺序也有正反
    	for(int i = 0; i < equations.length; i ++) {
    		if(!rec[i] && up.equals(equations[i][0])) {
    			rec[i] = true;
    			double temp = values[i] * cal(equations, values, equations[i][1], down, rec);
    			if(temp > 0)
    				return temp;
    			rec[i] = false;
    		}
    		if(!rec[i] && up.equals(equations[i][1])) {
    			rec[i] = true;
    			double temp = cal(equations, values, equations[i][0], down, rec) / values[i];
    			if(temp > 0)
    				return temp;
    			rec[i] = false;
    		}
    	}
    	return - 1.0;
    }
}