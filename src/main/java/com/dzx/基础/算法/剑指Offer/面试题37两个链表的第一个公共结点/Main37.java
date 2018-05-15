package com.dzx.基础.算法.剑指Offer.面试题37两个链表的第一个公共结点;

/**
 * Created by dzx on 2017/7/2.
 */
public class Main37 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1,p2 = pHead2;
        while(p1!=p2){
            p1 = p1.next==null?pHead2:p1.next;
            p2 = p2.next==null?pHead1:p2.next;
        }
        return p1;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
