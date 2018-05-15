package com.dzx.基础.算法.剑指Offer.面试题05从尾到头打印链表;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/13.
 */
public class Main05 {
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        print(listNode);
        return  list;
    }

    public void print(ListNode listNode){
        if (listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }

    }


}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}