package com.dzx.基础.算法.排序.冒泡排序;

/**
 * Created by Administrator on 2017/7/5.
 */
public class BubbleSort {
    public void bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }

    public void swap(int [] arr,int i,int j){

    }
}
