package com.dzx.基础.算法.剑指Offer.面试题30最小的k个数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Main30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        int n = input.length;
        if(n<k) return res;
        int capacity = n-k;
        for(int i=0;i<n;i++){
            queue.offer(input[i]);
            if(queue.size()>capacity){
                res.add(queue.poll());
            }
        }
        Collections.sort(res);
        return res;
    }
}
