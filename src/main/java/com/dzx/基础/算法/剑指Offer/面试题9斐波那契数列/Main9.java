package com.dzx.基础.算法.剑指Offer.面试题9斐波那契数列;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main9 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int pre = 0,fib = 1,res = 0;
        for(int i=2;i<=n;i++){
            res = fib+pre;
            fib = res;
            pre = fib;
        }
        return res;
    }
}
