package com.leetcode.no341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.leetcode.NestedInteger;

public class NestedIterator implements Iterator<Integer> {
	List<NestedInteger> ni;
	List<Integer> list;
	int index;
    public NestedIterator(List<NestedInteger> nestedList) {
        ni = nestedList;
        list = trans(ni);
        index = 0;
    }

    private List<Integer> trans(List<NestedInteger> ni) {
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0; i < ni.size(); i ++)
    		if(ni.get(i).isInteger())
    			list.add(ni.get(i).getInteger());
    		else
    			list.addAll(trans(ni.get(i).getList()));
    	return list;
    }

    @Override
    public Integer next() {
        return list.get(index ++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}