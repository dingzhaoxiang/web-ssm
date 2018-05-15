package com.dzx.基础.算法.剑指Offer.面试题22栈的压入弹出序列;

import java.util.Stack;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main22 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int indexPop,indexPush = 0;
        for(indexPop=0;indexPop<popA.length;indexPop++){
            if(!stack.empty()&&stack.peek()==popA[indexPop]){
                stack.pop();
            }
            else{
                while(indexPush<pushA.length){
                    if(pushA[indexPush]==popA[indexPop]){
                        indexPush++;
                        break;
                    }
                    else{
                        stack.push(pushA[indexPush++]);
                    }
                }
            }
        }
        return stack.empty();
    }


    public boolean isPop(int [] pushA,int [] popA){
        int indexPop,indexPush = 0;
        Stack<Integer> stack = new Stack<>();
        for(indexPop=0;indexPop<popA.length;indexPop++){
            if(!stack.empty()&&stack.peek()==popA[indexPop]){
                stack.pop();
            }
            else{
                while(indexPush<pushA.length){
                    if(pushA[indexPush]==popA[indexPop]){
                        indexPush++;
                        break;
                    }
                    else{
                        stack.push(pushA[indexPush]);
                    }
                }
            }
        }
        return stack.empty();
    }
}
