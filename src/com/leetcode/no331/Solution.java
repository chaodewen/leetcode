package com.leetcode.no331;

public class Solution {
//	String[] arr;
//    public boolean isValidSerialization(String preorder) {
//    	arr = preorder.split(",");
//    	if(arr.length == 0)
//    		return true;
//    	if(arr.length == 1)
//    	    return "#".equals(arr[0]);
//    	if("#".equals(arr[0]))
//    		return false;
//    	int rightIdx = getNextIdx(arr, 1);
//    	if(rightIdx == arr.length)
//    	    return false;
//    	return getNextIdx(arr, rightIdx) == arr.length ? true : false;
//    }
//    private int getNextIdx(String[] arr, int idx) {
//    	if(idx >= arr.length)
//    		return arr.length + 1;
//    	if("#".equals(arr[idx]))
//    		return idx + 1;
//    	int rigthIdx = getNextIdx(arr, idx + 1);
//    	return getNextIdx(arr, rigthIdx);
//    }
	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		// outdegree - indegree
		int diff = 1;
		for(String node : nodes)
			if(diff < 0)
				return false;
			else if("#".equals(node))
				diff --;
			else
				diff ++;
		return diff == 0;
	}
}