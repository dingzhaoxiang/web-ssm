package com.dzx.基础.算法.剑指Offer.面试题28字符串排列组合;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main28_1 {
    public static void main(String [] args){
        String s = "ABC";
        combine(s);
    }

    static void  combine(String str){
        int length=str.length();
        char[] in=str.toCharArray();
        StringBuffer out=new StringBuffer();

        allCombine(in,out,0);
    }

    static void  allCombine(char[] in,StringBuffer out,int start){
        for(int i=start;i<in.length;i++){
            out.append(in[i]);
            System.out.println(out);
            if(i<in.length-1){
                allCombine(in,out,i+1);
            }
            out.setLength(out.length()-1);
        }
    }
}
