package com.dzx.基础.算法.笔试题.百度.第2题;

import java.util.*;

/**
 * Created by Administrator on 2017/9/27.
 */
public class Solution {

    public static void main(String args []){
        Solution solution = new Solution();
        System.out.println(solution.findMaxMolecules(5,8,5,3,23));
    }
    int findMaxMolecules(int massA,int massB,int massC,int massD,int massX){
        List<Integer> list = new ArrayList<Integer>();
        list.add(massA);
        list.add(massB);
        list.add(massC*2);
        list.add(massD*2);
        Collections.sort(list);
        if(massX<list.get(0)){
            return 0;
        }
        int res  = findMax(list,massX);
        int ans = res==Integer.MIN_VALUE?0:res;
        return ans;
    }

    public int findMax(List<Integer> list,int massX){
        if(massX==0){
            return 0;
        }
        if(massX<list.get(0)){
            return Integer.MIN_VALUE;
        }
        int find0 = findMax(list,massX-list.get(0));
        int find1 = findMax(list,massX-list.get(1));
        int find2 = findMax(list,massX-list.get(2));
        int find3 = findMax(list,massX-list.get(3));
        int [] arr = new int [4];
        arr[0] = find0;
        arr[1] = find1;
        arr[2] = find2;
        arr[3] = find3;
        Arrays.sort(arr);
        if(arr[3]==Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return arr[3]+1;

    }
}
