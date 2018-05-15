package com.dzx.基础.算法.剑指Offer.面试题07用两个栈实现队列;

import java.util.Stack;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main07 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            int n = stack2.pop();
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
            return n;
    }
}
