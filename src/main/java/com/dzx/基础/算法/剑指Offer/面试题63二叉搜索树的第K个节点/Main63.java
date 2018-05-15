package com.dzx.基础.算法.剑指Offer.面试题63二叉搜索树的第K个节点;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main63 {
    int t= 0;
    TreeNode res = null;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        inOrder(pRoot,k);
        return res;
    }

    public void inOrder(TreeNode pRoot, int k){
        if(pRoot!=null){
            inOrder(pRoot.left,k);
            t++;
            if(t==k){
                res = pRoot;
            }
            inOrder(pRoot.right,k);
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
