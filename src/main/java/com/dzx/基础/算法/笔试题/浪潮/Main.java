package com.dzx.基础.算法.笔试题.浪潮;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int [] arr = new int [4];
            for(int i=0;i<4;i++){
                arr[i] = in.nextInt();
            }
            if(canTriangle(arr)){
                System.out.println("triangle");
            }
            else if(canSegment(arr)){
                System.out.println("segment");
            }
            else{
                System.out.println("impossible");
            }
        }
    }

    public static boolean canTriangle(int [] arr){
        Arrays.sort(arr);
        return canTriangle(arr[0],arr[1],arr[2])||canTriangle(arr[1],arr[2],arr[3]);
    }

    public static boolean canTriangle(int min,int mid,int max){
        return (min+mid>max)&&(max-mid<min);
    }


    public static boolean canSegment(int [] arr){
        Arrays.sort(arr);
        return canSegment(arr[0],arr[1],arr[2])||canSegment(arr[1],arr[2],arr[3]);
    }

    public static boolean canSegment(int min,int mid,int max){
        return min+mid==max;
    }

}
