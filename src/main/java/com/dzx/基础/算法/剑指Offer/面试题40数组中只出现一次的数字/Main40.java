package com.dzx.基础.算法.剑指Offer.面试题40数组中只出现一次的数字;

/**
 * Created by dzx on 2017/7/2.
 */
public class Main40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int temp = 0;
        for(int i=0;i<array.length;i++){
            temp ^= array[i];

        }
        int index = findFirstOneBit(temp);
        for(int i=0;i<array.length;i++){
            if(indeBitIsOne(array[i],index)){
                num1[0] ^= array[i];
            }
            else{
                num2[0] ^= array[i];
            }
        }
    }

    public boolean indeBitIsOne(int num,int index){
        return ((num>>index)&1)==1;
    }

    public int findFirstOneBit(int temp) {
        int index = 0;
        while((temp&1)==0&&index<32){
            temp = temp<<1;
            index++;
        }
        return index;
    }
}
