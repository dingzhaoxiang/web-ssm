package com.dzx.基础.算法.剑指Offer.面试题19二叉树的镜像;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main19 {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
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
