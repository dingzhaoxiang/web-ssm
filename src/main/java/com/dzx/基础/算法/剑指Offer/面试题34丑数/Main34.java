package com.dzx.基础.算法.剑指Offer.面试题34丑数;

/**
 * Created by Administrator on 2017/6/17.
 */
public class Main34 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int [] k = new int[index];
        k[0] = 1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<index;i++){
            k[i] = Math.min(2*k[i2],Math.min(3*k[i3],5*k[i5]));
            if(k[i]%2==0) i2++;
            if(k[i]%3==0) i3++;
            if(k[i]%5==0) i5++;
        }
        return k[index-1];
    }


    public int uglyNumber(int index){
        if(index<=0){
            return 0;
        }
        int [] k = new int [index];
        k[0] = 1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<index;i++){
            k[i] = Math.min(2*k[i2],Math.min(3*k[i3],5*k[5]));
            if(k[i]%2==0) i2++;
            if(k[i]%3==0) i3++;
            if(k[i]%5==0) i5++;
        }
        return k[index-1];
    }
}

/*The idea of this solution is from this page:http://www.geeksforgeeks.org/ugly-numbers/

The ugly-number sequence is 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … because every number can only be divided by 2, 3, 5, one way to look at the sequence is to split the sequence to three groups as below:

(1) 1×2, 2×2, 3×2, 4×2, 5×2, …
(2) 1×3, 2×3, 3×3, 4×3, 5×3, …
(3) 1×5, 2×5, 3×5, 4×5, 5×5, …
We can find that every subsequence is the ugly-sequence itself (1, 2, 3, 4, 5, …) multiply 2, 3, 5.

Then we use similar merge method as merge sort, to get every ugly number from the three subsequence.

Every step we choose the smallest one, and move one step after,including nums with same value.

Thanks for this author about this brilliant idea. Here is my java solution*/