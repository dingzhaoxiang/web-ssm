package com.dzx.基础.算法.笔试题.今日头条;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int [] arr = new int [n+1];
            boolean hasZero = false;
            for(int i=1;i<arr.length;i++){
                arr[i] = scanner.nextInt();
                if(arr[i]==0){
                    hasZero=true;
                }
            }
            if(hasZero){
                hasZero(x,arr);
            }
            else{
                noZero(x,arr);
            }

        }
    }

    public static void hasZero(int x,int [] arr){
        //寻找第一个非0
        int k = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=0){
                if(i==1){
                    k=arr.length-1;
                }
                else{
                    k = i-1;
                }
                break;
            }
        }
        int sum = 0;
        for(int i=1;i<=x;i++){
            if(arr[i]>=1) {
                arr[i] -= 1;
                sum++;
            }
        }
        arr[k] = sum;
        for(int i=1;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static  void noZero(int x,int [] arr){

        int sum = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>0) {
                arr[i] -= 1;
                sum++;
            }
            if(arr[i]==0){
                break;
            }

        }
        for(int i=1;i<=x;i++){
            if(arr[i]>=1){
                arr[i] -=1;
                sum++;
            }
            else{
                break;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                arr[i] = sum;
            }
        }
        for(int i=1;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]);
    }
}
