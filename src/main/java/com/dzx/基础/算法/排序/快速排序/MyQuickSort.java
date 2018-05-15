package com.dzx.基础.算法.排序.快速排序;

/**
 * Created by Administrator on 2017/7/5.
 */
public class MyQuickSort {
    public static void main(String [] args){
        int [] a ={72,6,57,88,60,42,83,73,48,85};
        myQuickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


    public static void myQuickSort(int [] s,int l,int r){
        if(l<r){
            int i = l;
            int j = r;
            int x = s[i];
            while(i<j){
                while(i<j&&s[j]>=x){
                    j--;
                }
                if(i<j){
                    s[i++] = s[j];
                }
                while(i<j&&s[i]<=x){
                    i++;
                }
                if(i<j){
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            myQuickSort(s,l,i-1);
            myQuickSort(s,i+1,r);
        }
    }
}
