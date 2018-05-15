package com.dzx.基础.算法.剑指Offer.面试题18树的子结构;

import java.util.HashMap;

/**
 * Created by dzx on 2017/7/1.
 */
public class Main18 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val==root2.val&&doHas(root1,root2)){
           return true;
        }
        else{
            return HasSubtree(root1.left,root2)|| HasSubtree(root1.right,root2);
        }
    }

    public boolean doHas(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val==root2.val){
            return doHas(root1.left,root2.left)&&doHas(root1.right,root2.right);
        }
        else{
            return false;
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
