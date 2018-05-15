package com.dzx.基础.算法.剑指Offer.面试题39二叉树的深度;

/**
 * Created by dzx on 2017/7/2.
 */
public class Main39 {
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
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
