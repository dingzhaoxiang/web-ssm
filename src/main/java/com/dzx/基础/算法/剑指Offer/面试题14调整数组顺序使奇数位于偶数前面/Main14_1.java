package com.dzx.基础.算法.剑指Offer.面试题14调整数组顺序使奇数位于偶数前面;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main14_1 {
    public void reOrderArray(int [] array) {
        int [] array2 = new int [array.length];
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                array2[index++] = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                array2[index++] = array[i];
            }
        }

        for(int i=0;i<array.length;i++){
            array[i] = array2[i];
        }

    }
}
