package com.dzx.基础.算法.剑指Offer.面试题41和为S的两个数;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/15.
 */
public class Main41 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0,right = array.length-1;
        while(left<right){
            if(array[left]+array[right]>sum){
                right--;
            }
            else if(array[left]+array[right]<sum){
                left++;
            }
            else{
                res.add(array[left]);
                res.add(array[right]);
                break;
            }
        }
        return res;
    }
}
