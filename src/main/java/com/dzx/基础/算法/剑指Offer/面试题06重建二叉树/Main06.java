package com.dzx.基础.算法.剑指Offer.面试题06重建二叉树;

import java.util.Arrays;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main06 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || in.length == 0 || pre.length == 0) {
            return null;
        }
        int root_val = pre[0];
        TreeNode root = new TreeNode(root_val);
        int i;
        for(i=0;i<in.length;i++){
            if(in[i]==root_val){
                break;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
