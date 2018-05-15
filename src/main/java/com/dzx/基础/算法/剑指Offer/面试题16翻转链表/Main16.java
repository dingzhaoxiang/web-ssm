package com.dzx.基础.算法.剑指Offer.面试题16翻转链表;

import java.util.List;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main16 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null,curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = pre;
            curr = temp;
            pre = curr;
        }
        return pre;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
