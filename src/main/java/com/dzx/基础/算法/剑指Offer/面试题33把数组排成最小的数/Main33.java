package com.dzx.基础.算法.剑指Offer.面试题33把数组排成最小的数;

import java.util.*;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main33 {
    public String PrintMinNumber(int [] numbers){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for(int i:list){
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public void test (Integer [] nums){
        Arrays.sort(nums,new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s1.compareTo(s2);
            }
        });
    }
}
