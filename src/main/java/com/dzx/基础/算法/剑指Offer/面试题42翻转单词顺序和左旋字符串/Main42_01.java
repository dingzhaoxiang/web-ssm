package com.dzx.基础.算法.剑指Offer.面试题42翻转单词顺序和左旋字符串;
public class Main42_01 {
	public String LeftRotateString(String str,int n) {
        if(str==null||n<0||n>=str.length()){
            return str;
        }
        StringBuffer sbl = new StringBuffer();
        StringBuffer sbr = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(i<n){
                sbl.append(str.charAt(i));
            }
            else{
                sbr.append(str.charAt(i));
            }
        }
        sbr.append(sbl.toString());
        return sbr.toString();
    }
}
