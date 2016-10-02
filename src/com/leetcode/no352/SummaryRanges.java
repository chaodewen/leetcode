package com.leetcode.no352;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.leetcode.Interval;

public class SummaryRanges {
    private TreeMap<Integer, Interval> tree;

    /** Initialize your data structure here. */
    public SummaryRanges() {
        tree = new TreeMap<>();
    }
    
    public void addNum(int val) {
        if(tree.containsKey(val))
            return;
        Integer l = tree.lowerKey(val), h = tree.higherKey(val);
        if(l != null && h != null && val == tree.get(l).end + 1 && val == h - 1) {
            tree.get(l).end = tree.get(h).end;
            tree.remove(h);
        }
        else if(l != null && val <= tree.get(l).end + 1)
            tree.get(l).end = Math.max(tree.get(l).end, val);
        else if(h != null && val == h - 1) {
            tree.put(val, new Interval(val, tree.get(h).end));
            tree.remove(h);
        }
        else
            tree.put(val, new Interval(val, val));
    }
    
    public List<Interval> getIntervals() {
        return new ArrayList<>(tree.values());
    }
}