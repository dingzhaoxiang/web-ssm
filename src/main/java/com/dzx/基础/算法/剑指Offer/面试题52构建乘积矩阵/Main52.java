package com.dzx.基础.算法.剑指Offer.面试题52构建乘积矩阵;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main52 {
    public int[] multiply(int[] A) {
        if(A==null||A.length==0){
            return A;
        }
        int l = A.length;
        int [] B = new int [l];
        if(l==1){
            B[0] = 1;
            return B;
        }
        int [] C = new int[l];
        int [] D = new int[l];
        C[0] = 1;
        D[l-1] = 1;
        for(int i=1;i<C.length;i++){
            C[i] = C[i-1]*A[i-1];
        }

        for(int i=l-2;i>=0;i--){
            D[i] = D[i+1]*A[i+1];
        }

        for(int i=0;i<B.length;i++){
            B[i] = C[i]*D[i];
        }
        return B;
    }
}
