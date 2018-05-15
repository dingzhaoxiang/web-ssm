package com.dzx.基础.算法.剑指Offer.面试题15链表的倒数第K个节点;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main15 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0){
            return null;
        }
        ListNode p1 = head,p2 = head;
        for(int i=0;i<k-1;i++){
            if(p1!=null){
                p1 = p1.next;
            }
            else{
                return null;
            }

        }
        while(p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}