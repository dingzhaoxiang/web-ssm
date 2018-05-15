package com.dzx.基础.算法.剑指Offer.面试题31连续子数组的最大和;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main31 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null){
            return 0;
        }
        int res = Integer.MIN_VALUE,tempMax = 0;
        for(int i=0;i<array.length;i++){
            tempMax += array[i];
            res = Math.max(res,tempMax);
            if(tempMax<0){
                tempMax = 0;
            }
        }
        return res;
    }
}
