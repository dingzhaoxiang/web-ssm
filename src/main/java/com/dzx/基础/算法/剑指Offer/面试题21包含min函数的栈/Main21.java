package com.dzx.基础.算法.剑指Offer.面试题21包含min函数的栈;

import java.util.Stack;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main21 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int minValue = Integer.MAX_VALUE;
    public void push(int node) {
       stack1.push(node);
       minValue = Math.min(minValue,node);
       stack2.push(minValue);
    }

    public void pop() {
        if(!stack1.empty()&&stack2.empty()){
            stack1.pop();
            stack2.pop();
            minValue = stack2.peek();
        }
    }

    public int top() {
       return stack1.peek();
    }

    public int min() {
      return stack2.peek();
    }
}
