package com.leetcode.no225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Cc on 16/10/5.
 */

// 一种机智的做法
// 复杂度O(1)
//class MyStack {
//    private Queue queue;
//    // Push element x onto stack.
//    public void push(int x) {
//        Queue q = new LinkedList();
//        q.add(x);
//        q.add(queue);
//        queue = q;
//    }
//
//    // Removes the element on top of the stack.
//    public void pop() {
//        queue.poll();
//        queue = (Queue) queue.poll();
//    }
//
//    // Get the top element.
//    public int top() {
//        return (int) queue.peek();
//    }
//
//    // Return whether the stack is empty.
//    public boolean empty() {
//        return queue == null;
//    }
//}

class MyStack {
    Queue<Integer> in = new LinkedList<>();
    Queue<Integer> out = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        if(!out.isEmpty())
            in.offer(out.poll());
        out.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(!out.isEmpty()) {
            out.poll();
            if(!in.isEmpty())
                while(!in.isEmpty()) {
                    int last = in.poll();
                    if(!in.isEmpty())
                        out.offer(last);
                    else {
                        in.offer(last);
                        Queue<Integer> temp = out;
                        out = in;
                        in = temp;
                        return;
                    }
                }
        }
    }

    // Get the top element.
    public int top() {
        return out.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return out.isEmpty();
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println(ms.empty());
    }
}