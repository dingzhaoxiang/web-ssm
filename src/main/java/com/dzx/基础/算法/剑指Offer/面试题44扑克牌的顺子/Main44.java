package com.dzx.基础.算法.剑指Offer.面试题44扑克牌的顺子;

import java.util.Arrays;

public class Main44 {
	public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length==0) return false;
		Arrays.sort(numbers);
        int nZero = 0;
        int gap = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                nZero++;
            }
            else{
            	if(i>0&&(numbers[i-1]!=0)){
                   int currGap = numbers[i]-numbers[i-1];
                   if(currGap==0){
                       return false;
                   }
                   gap += currGap-1;
                }
            }     
     			
        }
        if(nZero>=gap){
            return true;
        }
        else{
            return false;
        }
    }
}
