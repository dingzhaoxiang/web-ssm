package com.dzx.基础.算法.排序.归并排序;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/5.
 */
public class MergeSortTest {
    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }

    public static void mergeSort(int [] a,int l,int r){
        int m = (l+r)/2;
        if(l<r){
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }

    public static void merge(int [] a,int l,int m,int r){
        int [] temp = new int [r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;
        while(i<=m&&j<=r){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }

        while(j<=r){
            temp[k++] = a[j++];
        }

        while(i<=m){
            temp[k++] = a[i++];
        }

        for(int k2 = 0;k2<temp.length;k2++){
            a[k2+l] = temp[k2];
        }
    }
}
