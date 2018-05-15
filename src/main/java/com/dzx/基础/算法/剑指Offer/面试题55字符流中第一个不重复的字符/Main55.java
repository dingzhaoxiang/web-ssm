package com.dzx.基础.算法.剑指Offer.面试题55字符流中第一个不重复的字符;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main55 {
    int [] arr = new int[128];
    StringBuffer sb = new StringBuffer();
    public void Insert(char ch)
    {
        sb.append(ch);
        arr[ch]++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i=0;i<sb.length();i++){
            if(arr[sb.toString().charAt(i)]==1){
                return sb.toString().charAt(i);
            }
        }
        return '#';
    }
}
