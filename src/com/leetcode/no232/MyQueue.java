package com.leetcode.no232;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        a.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	if(b.isEmpty()) {
        	while(!a.isEmpty()) {
        		b.push(a.pop());
        	}
        }
        b.pop();
    }

    // Get the front element.
    public int peek() {
        if(b.isEmpty()) {
        	while(!a.isEmpty()) {
        		b.push(a.pop());
        	}
        }
        return b.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
    public static void main(String[] args) {
    	System.out.println(new MyQueue().empty());
    }
}