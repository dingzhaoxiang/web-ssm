package com.dzx.基础.算法.剑指Offer.面试题32从1到N中1出现的次数;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main32 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i=1;i<=n;i=i*10){
            int a = n/i;
            int b = n%i;
            if(a%10==1){
                count += a/10*i+b+1;
            }
            else{
                count +=(a+8)/10*i;
            }
        }
        return count;
    }

    public int NumberOf1Between1AndN_Solution2(int n) {
        int count = 0;
        for(int i=1;i<n;i*=10){

        }
        return count;
    }
}
