package com.dzx.基础.算法.剑指Offer.面试题59对称的二叉树;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main59 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null) return true;
        if(pRoot.left==null&&pRoot.right==null) return true;
        if (pRoot.left!=null&&pRoot.right!=null){
            if(pRoot.left.val==pRoot.right.val){
                return isSymmetrical(pRoot.left)&&isSymmetrical(pRoot.right);
            }
        }
        return false;
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
