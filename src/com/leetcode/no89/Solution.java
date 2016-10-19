package com.leetcode.no89;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> grayCode(int n) {
		List<Integer> ret = new ArrayList<>();
		if(n == 0)
			ret.add(0);
		else {
			List<Integer> tempList = grayCode(n - 1);
			ret.addAll(tempList);
			for(int i = tempList.size() - 1; i >= 0; i --)
				ret.add(tempList.get(i) + (1 << (n - 1)));
		}
		return ret;
	}
}