package com.leetcode.no89;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> grayCode(int n) {
		List<Integer> ret = new ArrayList<Integer>();
		if(n == 0) {
			ret.add(0);
		}
		else {
			List<Integer> temp = grayCode(n - 1);
			for(Integer i : temp) {
				ret.add(i);
			}
			for(int i = temp.size() - 1; i >= 0; i --) {
				ret.add(temp.get(i) + (1 << (n - 1)));
			}
		}
		return ret;
	}
}