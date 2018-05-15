package com.dzx.基础.算法.剑指Offer.面试题28字符串排列组合;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main28 {

    public static void main(String[] args) {
        Main28 main28 = new Main28();
        ArrayList<String> list =  main28.Permutation("ABC");
        System.out.println(list);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if(str!=null&&str.length()>0){
            PermutationHandler(str.toCharArray(),0,list);
        }
        return list;
    }

    public void PermutationHandler(char [] arr,int i,List<String> list){
        if(i==arr.length-1){
            list.add(String.valueOf(arr));
        }
        else{
            for(int j=i;j<arr.length;j++){
                if(j==i||arr[j]!=arr[i]){
                    swap(arr,i,j);
                    PermutationHandler(arr,i+1,list);
                    swap(arr,i,j);
                }
            }
        }
    }

    public void swap(char [] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
