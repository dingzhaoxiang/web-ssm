package com.dzx.基础.算法.剑指Offer.面试题60把二叉树打印成多行;

import java.util.ArrayList;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrder(res,pRoot,0);
        return res;
    }

    public void levelOrder(ArrayList<ArrayList<Integer>> res,TreeNode pRoot,int level){
        if(pRoot==null) return;
        if(res.size()==level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level++).add(pRoot.val);
        levelOrder(res,pRoot.left,level);
        levelOrder(res,pRoot.right,level);

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
