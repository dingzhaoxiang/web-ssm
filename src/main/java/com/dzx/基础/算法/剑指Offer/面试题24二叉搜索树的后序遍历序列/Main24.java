package com.dzx.基础.算法.剑指Offer.面试题24二叉搜索树的后序遍历序列;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Main24 {
    public boolean VerifySquenceOfBST(int [] arr){
        if(arr==null&&arr.length==0){
            return false;
        }
        if(arr.length==1){
            return false;
        }
        int root = arr[arr.length-1];
        int left = 0;
        for(;left<arr.length;left++){
            if(arr[left]>root){
                break;
            }
        }
        //left是第一个大于root的值的下标
        int right = left;
        for(;right<arr.length;right++){
            if(arr[right]<root){
                return false;
            }
        }
        boolean le = true;
        if(left>0){
            le = VerifySquenceOfBST(Arrays.copyOfRange(arr,0,left));
        }
        boolean ri = true;
        if(left<arr.length-1){
            ri = VerifySquenceOfBST(Arrays.copyOfRange(arr,left,arr.length-1));
        }
        return le&&ri;
    }
}
