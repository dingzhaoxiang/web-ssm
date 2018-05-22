package com.dzx.基础.Java基础.测试;

/**
 * Created by Administrator on 2017/12/2.
 */
public class Main {
    public static void  main(String [] args){
        Main main = new Main();
        main.test();
    }
    public  void test(){
        int [] arr = {1,2,3};
        int [] test = new int[] {1,2,3,4};
        test2(arr);
        System.out.println(arr[1]);
    }

    public void test2(int [] arr){
        arr[1] = 100;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode pre = null,curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = pre;
            curr = temp;
            pre = curr;
        }
        while(head!=null&&pre!=null){
            if(head.val!=pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;

        }
        return true;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
