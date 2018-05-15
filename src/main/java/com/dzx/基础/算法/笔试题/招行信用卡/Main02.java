package com.dzx.基础.算法.笔试题.招行信用卡;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int m = in.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            if(m<=2){
                System.out.println("true");
            }
            if(m%2==1) {
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }

    }

}
