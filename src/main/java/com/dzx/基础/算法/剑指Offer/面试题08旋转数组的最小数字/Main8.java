package com.dzx.基础.算法.剑指Offer.面试题08旋转数组的最小数字;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main8 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        if(array.length==1){
            return array[0];
        }
        int left = 0,right = array.length-1,mid = 0;
        while(array[left]>=array[right]){
            if(right-left==1){
                return array[right];
            }
            mid = (left+right)/2;
            if(array[mid]>=array[left]){
                left = mid;
            }
            else if(array[mid]<=array[right]){
                right = mid;
            }
        }
        return array[mid];
    }
}
