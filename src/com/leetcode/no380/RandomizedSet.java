package com.leetcode.no380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random r;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        r = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val, list.size());
        return list.add(val);
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int lastVal = list.remove(list.size() - 1);
        int valIndex = map.remove(val);
        if(lastVal != val) {
            list.set(valIndex, lastVal);
            map.put(lastVal, valIndex);
        }
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}