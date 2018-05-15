package com.dzx.基础.算法.剑指Offer.面试题14调整数组顺序使奇数位于偶数前面;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main14 {
    public void reOrderArray(int [] array) {
        int left = 0,right = array.length-1,temp;
        while(left<=right){
            if(array[left]%2==1&&array[right]%2==0){
                left++;
                right--;
            }
            else if(array[left]%2==1&&array[right]%2==1){
                left++;
            }
            else if(array[left]%2==0&&array[right]%2==0){
                right--;
            }
            else{
                temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
                right--;
            }
        }
    }


    public void swap(int [] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
