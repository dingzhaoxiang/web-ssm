package com.dzx.基础.算法.剑指Offer.面试题53正则表达式匹配;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main53 {
    public boolean match(char[] str, char[] pattern){
        return new String(str).matches(new String(pattern));
    }
}
