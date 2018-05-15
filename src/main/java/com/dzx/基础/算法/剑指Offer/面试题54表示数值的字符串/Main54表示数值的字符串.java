package com.dzx.基础.算法.剑指Offer.面试题54表示数值的字符串;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main54表示数值的字符串 {
    public boolean isNumeric(char[] str) {
        try {
            double d = Double.parseDouble(new String(str));
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
