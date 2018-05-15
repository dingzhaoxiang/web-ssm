package com.dzx.基础.算法.笔试题.浪潮;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            if(n<=10){
                System.out.println("3.50");
            }
            else {
                double moneny = 3.50 + (n - 10) * 0.75;
                String result = String.format("%.2f", moneny);
                System.out.println(result);
            }
        }
    }
}
