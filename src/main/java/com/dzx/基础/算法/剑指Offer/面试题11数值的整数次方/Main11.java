package com.dzx.基础.算法.剑指Offer.面试题11数值的整数次方;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main11 {
    public double Power(double base, int exponent) {
        if(exponent==0) return 1;
        if(exponent<0){
            if(exponent==Integer.MIN_VALUE){
                return 1/base*Power(base,exponent+1);
            }
            base = 1/base;
            exponent = -exponent;
        }
        return exponent%2==0?Power(base*base,exponent/2):base*Power(base*base,exponent/2);
    }
}
