package com.dzx.基础.算法.笔试题.招行信用卡;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int minCommon = minCommonMultiple(a,b);
            int res = 0;
            for(int i=1;minCommon*i<=n;i++){
                res++;
            }
            System.out.println(res);
        }
    }

    //求最大公约数
    public static int maxCommonDivisor(int m,int n){
        if(m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        while(m%n!=0){
            int temp = m%n;
            m = n;
            n = temp;
        }
        return n;
    }
    //求最小公倍数
    public static int minCommonMultiple(int m,int n){
        return m*n/maxCommonDivisor(m, n);
    }
}
