package com.dzx.基础.数据结构.链表.链表环的问题;

/**
 * Created by dzx on 2017/7/8.
 */
public class Main {
    //是否有环
    public static boolean hasCircle(ListNode head){
        ListNode p1 = head,p2 = head;
        while(p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                return true;
            }
        }
        return false;
    }
    //环的长度
    public static int lengthOfCircle(ListNode head){
        ListNode p1 = head,p2 = head;
        while(p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                break;
            }
        }
        int l = 0;
        while(p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            l++;
            if(p1==p2){
                break;
            }
        }
        return l;
    }

    //连接点
    public static ListNode jointNode(ListNode head){
        ListNode p1 = head,p2 = head;
        while(p2!=null&&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1==p2){
                break;
            }
        }
        ListNode curr = head;
        while(curr!=p1){
            curr = curr.next;
            p1 = p1.next;
        }
        return curr;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

