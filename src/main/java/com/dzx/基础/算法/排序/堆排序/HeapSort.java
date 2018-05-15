package com.dzx.基础.算法.排序.堆排序;

/**
 * Created by dzx on 2017/7/8.
 */
public class HeapSort {
    public static void heapSort(int [] a){
        for(int i=0;i<a.length;i++){
            createMaxHeap(a,a.length-1-i);
            swap(a,0,a.length-i-1);
        }
    }


    public static void createMaxHeap(int [] a,int lastIndex){

        for(int i=(lastIndex-1)/2;i>=0;i--){
            int k = i;
            while(k*2+1<=lastIndex) {
                int biggerIndex = k*2+1;
                if (biggerIndex< lastIndex) {
                    if (a[biggerIndex] < a[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                if (a[k] < a[biggerIndex]){
                    swap(a,k,biggerIndex);
                    k = biggerIndex;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void  swap(int []a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
