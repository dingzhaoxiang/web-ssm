package com.dzx.基础.算法.剑指Offer.面试题27二叉搜索树与双向链表;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Main27 {
    public TreeNode Convert(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return root;
        }
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        while(p!=null&&p.right!=null){
            p = p.right;
        }
        if(left!=null){
            p.right = root;
            root.left = p;
        }

        TreeNode right = Convert(root.right);
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;
    }

}



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}