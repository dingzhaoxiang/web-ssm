package com.dzx.基础.算法.剑指Offer.面试题61之字形打印二叉树;

import java.util.ArrayList;

/**
 * Created by dzx on 2017/7/7.
 */
public class Main61 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        leftLevelOrder(pRoot,0,res);
        rightLevelOrder(pRoot,0,res);
        return res;
    }

    public void leftLevelOrder(TreeNode node,int level,ArrayList<ArrayList<Integer>> levels){
        if(node==null) return;
        if(levels.size()==level) levels.add(new ArrayList<Integer>());
        if(level%2==0) levels.get(level).add(node.val);
        level++;
        leftLevelOrder(node.left,level,levels);
        leftLevelOrder(node.right,level,levels);
    }
    public void rightLevelOrder(TreeNode node,int level,ArrayList<ArrayList<Integer>> levels){
        if(node==null) return;
        if(levels.size()==level) levels.add(new ArrayList<Integer>());
        if(level%2!=0) levels.get(level).add(node.val);
        level++;
        rightLevelOrder(node.right,level,levels);
        rightLevelOrder(node.left,level,levels);
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
