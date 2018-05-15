package com.dzx.基础.算法.剑指Offer.面试题29数组中出现次数超过一半的数字;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main29 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0||array==null){
            return 0;
        }
        int result = array[0],times = 1;
        for(int i=1;i<array.length;i++){
            if(times==0){
                result = array[i];
                times = 1;
            }
            else if(result==array[i]){
                times++;
            }
            else {
                times--;
            }
        }
        if(isValid(array,result)){
            return result;
        }
        else{
            return 0;
        }

    }
    public boolean isValid(int [] array,int result){
        int times = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==result){
                times++;
            }
        }
        if(times*2>array.length){
            return true;
        }
        else{
            return false;
        }
    }
}
