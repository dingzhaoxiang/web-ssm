package com.dzx.基础.算法.剑指Offer.面试题51数组中重复的数字;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main51 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length==0) return false;
        for(int i=0;i<length;i++){
            if(numbers[i]<0||numbers[i]>=length){
                return false;
            }
        }
        for(int i=0;i<numbers.length;i++){
            while(numbers[i]!=i){
                int temp = numbers[i];
                if(numbers[i]==numbers[temp]){
                    duplication[0] = numbers[i];
                    return true;
                }
                else{
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }
}
