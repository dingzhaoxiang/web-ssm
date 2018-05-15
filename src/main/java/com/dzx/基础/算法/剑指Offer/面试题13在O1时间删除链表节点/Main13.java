package com.dzx.基础.算法.剑指Offer.面试题13在O1时间删除链表节点;

import java.util.List;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main13 {
    public void deleteNode(ListNode node){
        ListNode curr = node;
        while(curr.next!=null){
            curr.val = curr.next.val;
            if(curr.next.next==null){
                curr.next = null;
                return;
            }
            curr = curr.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
