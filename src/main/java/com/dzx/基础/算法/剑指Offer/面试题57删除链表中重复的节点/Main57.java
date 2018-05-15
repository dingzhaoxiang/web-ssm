package com.dzx.基础.算法.剑指Offer.面试题57删除链表中重复的节点;

import java.util.List;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main57 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return pHead;
        if(pHead.val==pHead.next.val){
            ListNode pNode = pHead.next;
            while (pNode!=null&&pNode.val==pHead.val){
                pNode = pNode.next;
            }
            return deleteDuplication(pNode);
        }
        else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
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
