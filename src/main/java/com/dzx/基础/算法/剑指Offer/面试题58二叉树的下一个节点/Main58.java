package com.dzx.基础.算法.剑指Offer.面试题58二叉树的下一个节点;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main58 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return pNode;
        //有没有右子树
        if(pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left!=null) pNode = pNode.left;
            return pNode;
        }
        //找其父节点，且为父节点的左子树
        while(pNode.next!=null){
            if(pNode.next.left==pNode) return pNode.next;
            pNode = pNode.next;
        }
        return null;


    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
