package com.dzx.基础.算法.排序.归并排序;

/**
 * Created by dzx on 2017/6/19.
 */
import java.util.Arrays;
public class MyMergeSort {
    public static void main(String[] args) {
        int a [] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int [] a,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a,low,mid,high);
        }
    }

    public static void merge(int [] a,int low,int mid,int high){
        int [] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid&&j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int n=0;n<temp.length;n++){
            a[n+low] = temp[n];
        }
    }
}

