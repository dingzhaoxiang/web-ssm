package com.dzx.基础.算法.剑指Offer.面试题38数字在排序数组中出现的次数;

/**
 * Created by dzx on 2017/7/2.
 */
public class Main38 {
    public int GetNumberOfK(int [] array , int k) {
        return 0;
    }

    public static int findFirstk(int [] array , int k){
        int l = 0,r = array.length-1,p = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(array[m]<k){
                l = m+1;
            }
            else if(array[m]>k){
                r = m-1;
            }
            else{
                if(m>0&&array[m-1]==k){
                    r = m-1;
                }
                else{
                    p = m;
                    return p;
                }
            }
        }
        return p;

    }
}
