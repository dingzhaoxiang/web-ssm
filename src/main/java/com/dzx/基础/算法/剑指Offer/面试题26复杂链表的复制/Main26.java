package com.dzx.基础.算法.剑指Offer.面试题26复杂链表的复制;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Main26 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode head = new RandomListNode(0);
        RandomListNode currHead1 = head;
        RandomListNode curr1 = pHead;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        while (curr1 != null) {
            currHead1.next = new RandomListNode(curr1.label);
            map.put(curr1, currHead1.next);
            curr1 = curr1.next;
            currHead1 = currHead1.next;
        }

        RandomListNode currHead2 = head;
        RandomListNode curr2 = pHead;
        while (curr2 != null) {
            curr2.random = map.get(curr1.random);
            curr2 = curr2.next;
            currHead2 = currHead2.next;
        }
        return head.next;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
