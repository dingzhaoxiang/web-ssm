package com.dzx.基础.算法.剑指Offer.面试题17合并两个排序的链表;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main17 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head = new ListNode(0);
        ListNode curr = head,curr1 = list1,curr2 = list2;
        while(curr1!=null&&curr2!=null){
            if(curr1.val<curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
            }
            else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        if(curr1==null){
            curr.next = curr2;
        }
        if(curr2==null){
            curr.next = curr1;
        }
        return head.next;
    }

    public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<=list2.val){
            list1.next = Merge2(list1.next,list2);
            return list1;
        }
        else{
            list2.next = Merge2(list1,list2.next);
            return list2;
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