package com.dzx.基础.算法.剑指Offer.面试题10数值二进制表示中1的个数;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main10 {
    public int num(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
