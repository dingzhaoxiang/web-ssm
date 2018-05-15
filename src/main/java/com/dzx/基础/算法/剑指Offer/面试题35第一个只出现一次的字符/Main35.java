package com.dzx.基础.算法.剑指Offer.面试题35第一个只出现一次的字符;

/**
 * Created by Administrator on 2017/9/15.
 */
public class Main35 {
    public int FirstNotRepeatingChar(String str) {
        int [] arr = new int [128];
        for(char c:str.toCharArray()){
            arr[c]++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
